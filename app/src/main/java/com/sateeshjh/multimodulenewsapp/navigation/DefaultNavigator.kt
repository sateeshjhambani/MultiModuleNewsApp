package com.sateeshjh.multimodulenewsapp.navigation

import android.app.Activity
import com.example.common_utils.Activities
import com.example.common_utils.Navigator
import com.sateeshjh.news_presentation.GoToNewsActivity
import com.sateeshjh.search_presentation.GoToSearchActivity

class DefaultNavigator: Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when(activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }
            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }
}