package Cedacri.Advanced;

import org.junit.jupiter.api.*;

class HospitalManagementTest {
    private final Doctor doctor = new Doctor(0,38,5,"Adam Smith",DoctorTypes.PSYCHIATRISTS);
    private final Patient patient = new Patient(46, "Lorem Ipsum","Adam Smith","Diabetes",
            "Male",180.5,99.5);

    private HospitalManagement hospitalManagement;

    @BeforeEach
    public void setup()
    {
        hospitalManagement = new HospitalManagement();
    }

    @Test
    @DisplayName("Creating An Empty Hospital")
    public void testCreatingEmptyHospital()
    {
        Assertions.assertEquals(0,hospitalManagement.getDoctorsList().size());
        Assertions.assertEquals(0,hospitalManagement.getPatientsList().size());
    }
    @Test
    @DisplayName("Adding a single doctor")
    public void testAddSingleDoctor()
    {
        hospitalManagement.addDoctor(doctor);
        Assertions.assertEquals(1,hospitalManagement.getDoctorsList().size());
    }

    @Test
    @DisplayName("Adding a single patient")
    public void testAddSinglePatient()
    {
        hospitalManagement.addPatient(patient);
        Assertions.assertEquals(1,hospitalManagement.getPatientsList().size());
    }
    @Test
    @DisplayName("Should Not Create A New Doctor")
    public void testAddSameDoctor()
    {
        hospitalManagement.addDoctor(doctor);
        Assertions.assertThrows(RuntimeException.class,()->
                hospitalManagement.addDoctor(doctor));
        Assertions.assertEquals(1,hospitalManagement.getDoctorsList().size());
    }

    @Test
    @DisplayName("Should Not Create A New Patient")
    public void testAddSamePatient()
    {
        hospitalManagement.addPatient(patient);
        Assertions.assertThrows(RuntimeException.class,()->
                hospitalManagement.addPatient(patient));
        Assertions.assertEquals(1,hospitalManagement.getPatientsList().size());
    }

    @Test
    @DisplayName("Removing the doctor when the list is not empty")
    public void testRemoveDoctor()
    {
        hospitalManagement.addDoctor(doctor);
        hospitalManagement.removeDoctor(doctor);
        Assertions.assertEquals(0,hospitalManagement.getDoctorsList().size());
    }

    @Test
    @DisplayName("Removing the patient when the list is not empty")
    public void testRemovePatient()
    {
        hospitalManagement.addPatient(patient);

        hospitalManagement.removePatient(patient);

        Assertions.assertEquals(0,hospitalManagement.getPatientsList().size());
    }

    @Test
    @DisplayName("Should throw RuntimeException when we try to remove a doctor from an empty list")
    public void testRemoveFromEmptyDoctorList()
    {
        Assertions.assertThrows(RuntimeException.class,
                ()->hospitalManagement.removeDoctor(doctor));
    }

    @Test
    @DisplayName("Should throw RuntimeException when we try to remove a patient from an empty list")
    public void testRemoveFromEmptyPatientList()
    {
        Assertions.assertThrows(RuntimeException.class,
                ()->hospitalManagement.removePatient(patient));
    }


    @Test
    @DisplayName("Should update Patient.doctorID")
    public void testSetValidDoctorID()
    {
        hospitalManagement.setDoctorID(patient,0);

        hospitalManagement.addDoctor(doctor);
        hospitalManagement.addPatient(patient);


        Assertions.assertEquals(doctor.getID(),patient.getDoctorID());
    }

    @Test
    @DisplayName("Should throw RuntimeException when ID is invalid")
    public void testSetInvalidDoctorID()
    {
        hospitalManagement.addDoctor(doctor);
        hospitalManagement.addPatient(patient);
        Assertions.assertThrows(RuntimeException.class,()->hospitalManagement.setDoctorID(patient,666));
    }

    @Test
    public void testCheckIfDoctorIsRightForThePatient()
    {
        Assertions.assertTrue(hospitalManagement.
                checkIfDoctorIsRightForThePatient(doctor.getDoctorType(), "Anxiety"));

        Assertions.assertFalse(hospitalManagement.
                checkIfDoctorIsRightForThePatient(doctor.getDoctorType(),"Blisters"));
    }

    @Test
    public void testCheckIfMultiplyDoctorIsRightForThePatient()
    {
        Assertions.assertTrue(hospitalManagement.
                checkIfDoctorIsRightForThePatient(DoctorTypes.PODIATRISTS, "Diabetes"));

        Assertions.assertTrue(hospitalManagement.
                checkIfDoctorIsRightForThePatient(DoctorTypes.PEDIATRICIANS, "Diabetes"));
    }

    //TODO
    // COVERAGE
    @Test
    public void testGet()
    {
        //getAge();
        Assertions.assertEquals(38,doctor.getAge());
        Assertions.assertEquals(46,patient.getAge());

        //getName();
        Assertions.assertEquals("Adam Smith",doctor.getName());
        Assertions.assertEquals("Lorem Ipsum",patient.getName());

        //getDoctorType();
        Assertions.assertEquals(DoctorTypes.PSYCHIATRISTS,doctor.getDoctorType());

        //getID()
        Assertions.assertEquals(0,doctor.getID());

        //getExperience()
        Assertions.assertEquals(5,doctor.getExperience());

        //getDoctorName();
        Assertions.assertEquals(doctor.getName(),patient.getDoctorName());

        //getDiagnosis();
        Assertions.assertEquals("Diabetes",patient.getDiagnosis());

        //getGender();
        Assertions.assertEquals("Male",patient.getGender());

        Assertions.assertEquals(180.5,patient.getHeight());

        Assertions.assertEquals(99.5,patient.getWeight());
    }
    @Test
    public void testSet()
    {
        patient.setAge(40);
        patient.setName("TEST");
        patient.setDoctorName("TESTDOC");
        patient.setDoctorID(5);
        patient.setDiagnosis("TESTDIAGNOSIS");
        patient.setGender("Female");
        patient.setHeight(185.5);
        patient.setWeight(105.7);

        doctor.setID(5);
        doctor.setAge(40);
        doctor.setExperience(10);
        doctor.setName("TestDoctor");
        doctor.setDoctorType(DoctorTypes.PODIATRISTS);

        //Patient
        Assertions.assertEquals(40,patient.getAge());
        Assertions.assertEquals("TEST",patient.getName());
        Assertions.assertEquals("TESTDOC",patient.getDoctorName());
        Assertions.assertEquals(5,patient.getDoctorID());
        Assertions.assertEquals("TESTDIAGNOSIS",patient.getDiagnosis());
        Assertions.assertEquals("Female",patient.getGender());
        Assertions.assertEquals(185.5,patient.getHeight(),0.0);
        Assertions.assertEquals(105.7,patient.getWeight());

        //Doctor
        Assertions.assertEquals(5,doctor.getID());
        Assertions.assertEquals(40,doctor.getAge());
        Assertions.assertEquals(10,doctor.getExperience());
        Assertions.assertEquals("TestDoctor",doctor.getName());
        Assertions.assertEquals(DoctorTypes.PODIATRISTS,doctor.getDoctorType());
    }



}