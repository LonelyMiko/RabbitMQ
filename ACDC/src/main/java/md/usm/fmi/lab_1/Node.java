package md.usm.fmi.lab_1;

import md.usm.fmi.assets.Movie;

public class Node
{
    Movie data;
    Node left, right;


    Node(Movie key)
    {
        data = key;
        left = right = null;
    }
}
