package com.yourname.people.school;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Charles on 10/10/2016.
 */
public class HonorStudent extends Student implements HonorStudentInf
{
    private List<String> awardsList = new ArrayList<String>();

    public List<String> getAwardsList()
    {
        return awardsList;
    }
}
