package Cedacri.Advanced;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TEST {
    Map<String, ArrayList<String>> map = new TreeMap<>();
    public TEST() {

        ArrayList<String> FAMILYPHYSICIANS = new ArrayList<>();
        FAMILYPHYSICIANS.add("Cuts");
        FAMILYPHYSICIANS.add("Scrapes");
        FAMILYPHYSICIANS.add("Broken bones");
        FAMILYPHYSICIANS.add("Swelling in the arms or legs");
        FAMILYPHYSICIANS.add("Minor burns");
        FAMILYPHYSICIANS.add("Menopause");
        FAMILYPHYSICIANS.add("Cancer screenings");
        FAMILYPHYSICIANS.add("Fever");
        FAMILYPHYSICIANS.add("Nosebleeds");
        FAMILYPHYSICIANS.add("Ear infections");
        FAMILYPHYSICIANS.add("Allergies");
        FAMILYPHYSICIANS.add("ADHD");
        FAMILYPHYSICIANS.add("Fungus issues");
        FAMILYPHYSICIANS.add("Skin conditions");

        ArrayList<String> INTERNISTS = new ArrayList<>();
        INTERNISTS.add("Dyspnea");
        INTERNISTS.add("Fatigue");
        INTERNISTS.add("Weight loss");
        INTERNISTS.add("Chest pain");
        INTERNISTS.add("Confusion");

        ArrayList<String> PEDIATRICIANS = new ArrayList<>();
        PEDIATRICIANS.add("Asthma");
        PEDIATRICIANS.add("Allergy");
        PEDIATRICIANS.add("Cerebral Palsy");
        PEDIATRICIANS.add("Diabetes");
        PEDIATRICIANS.add("Obesity");
        PEDIATRICIANS.add("Sickle Cell Disease");

        ArrayList<String> PSYCHIATRISTS = new ArrayList<>();
        PSYCHIATRISTS.add("Anxiety");
        PSYCHIATRISTS.add("Worry");
        PSYCHIATRISTS.add("Fear");
        PSYCHIATRISTS.add("Depressed");
        PSYCHIATRISTS.add("Suicidal thinking");
        PSYCHIATRISTS.add("Hallucinations");
        PSYCHIATRISTS.add("Delusions");
        PSYCHIATRISTS.add("Rushing");
        PSYCHIATRISTS.add("Violence");
        PSYCHIATRISTS.add("Insomnia");

        ArrayList<String> SURGEONS = new ArrayList<>();
        SURGEONS.add("Abdominal Pain");
        SURGEONS.add("Cancer");
        SURGEONS.add("Gallstones");
        SURGEONS.add("Gallbladder Inflammation");
        SURGEONS.add("Hernia");
        SURGEONS.add("Thyroid Disorders");
        SURGEONS.add("Varicose Veins");

        ArrayList<String> PATHOLOGISTS = new ArrayList<>();
        PATHOLOGISTS.add("Transfusion");
        PATHOLOGISTS.add("Chemical pathology");
        PATHOLOGISTS.add("Cytopathology");
        PATHOLOGISTS.add("Dermatopathology");
        PATHOLOGISTS.add("Hematology");
        PATHOLOGISTS.add("Neuropathology");
        PATHOLOGISTS.add("Histopathology");


        ArrayList<String> NEUROLOGISTS = new ArrayList<>();
        NEUROLOGISTS.add("Epilepsy");
        NEUROLOGISTS.add("Alzheimer");
        NEUROLOGISTS.add("Stroke");
        NEUROLOGISTS.add("Migraine");
        NEUROLOGISTS.add("Sclerosis");
        NEUROLOGISTS.add("Parkinson");
        NEUROLOGISTS.add("Brain tumors");
        NEUROLOGISTS.add("Brain trauma ");
        NEUROLOGISTS.add("Infections");
        NEUROLOGISTS.add("Cancers ");


        ArrayList<String> OPHTHALMOLOGISTS = new ArrayList<>();
        OPHTHALMOLOGISTS.add("Cataracts");
        OPHTHALMOLOGISTS.add("Blepharitis");
        OPHTHALMOLOGISTS.add("Glaucoma");
        OPHTHALMOLOGISTS.add("Keratoconus");
        OPHTHALMOLOGISTS.add("Amblyopia");
        OPHTHALMOLOGISTS.add("Uveitis");
        OPHTHALMOLOGISTS.add("Strabismus");
        OPHTHALMOLOGISTS.add("Exotropia");


        ArrayList<String> DERMATOLOGISTS = new ArrayList<>();
        DERMATOLOGISTS.add("Acne");
        DERMATOLOGISTS.add("Skin cancer");
        DERMATOLOGISTS.add("Dermatitis");
        DERMATOLOGISTS.add("Infections");
        DERMATOLOGISTS.add("Hair loss");
        DERMATOLOGISTS.add("Nail problems");
        DERMATOLOGISTS.add("Vitiligo");
        DERMATOLOGISTS.add("Shingles");


        ArrayList<String> PODIATRISTS = new ArrayList<>();
        PODIATRISTS.add("Foot injuries");
        PODIATRISTS.add("Diabetes");
        PODIATRISTS.add("Arthritis");
        PODIATRISTS.add("Growing pains");
        PODIATRISTS.add("Heel pain");
        PODIATRISTS.add("Morton’s neuroma");
        PODIATRISTS.add("Blisters");
        PODIATRISTS.add("Arthritis");


        map.put("FAMILYPHYSICIANS",FAMILYPHYSICIANS);
        map.put("PODIATRISTS",PODIATRISTS);
        map.put("DERMATOLOGISTS",DERMATOLOGISTS);
        map.put("OPHTHALMOLOGISTS",OPHTHALMOLOGISTS);
        map.put("NEUROLOGISTS",NEUROLOGISTS);
        map.put("PATHOLOGISTS",PATHOLOGISTS);
        map.put("SURGEONS",SURGEONS);
        map.put("PSYCHIATRISTS",PSYCHIATRISTS);
        map.put("PEDIATRICIANS",PEDIATRICIANS);
        map.put("INTERNISTS",INTERNISTS);


    }
}
