package me.miu.multimodulearch

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import me.miu.common_utils.Navigator
import me.miu.multimodulearch.navigation.DefaultNavigator
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {


    @Provides
    @Singleton
    fun provideProvider(): Navigator.Provider{
        return DefaultNavigator()
    }

}