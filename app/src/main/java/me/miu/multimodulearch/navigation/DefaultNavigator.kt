package me.miu.multimodulearch.navigation

import me.miu.common_utils.Activities
import me.miu.common_utils.Navigator
import me.miu.news_presentation.GoToNewsActivity
import me.miu.search_presentation.GoToSearchActivity

class DefaultNavigator : Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivity -> {
                GoToNewsActivity
            }
            Activities.SearchActivity -> {
                GoToSearchActivity
            }
        }
    }
}