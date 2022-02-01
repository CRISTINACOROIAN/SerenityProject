package org.fasttrack.features.search;

import org.fasttrack.steps.serenity.SearchSteps;
import org.junit.Test;

public class SearchTest extends BaseTest {


    @Test
    public void searchTest(){
        SearchSteps searchSteps = new SearchSteps();
        searchSteps.executeSearch("beanie");
    }
}
