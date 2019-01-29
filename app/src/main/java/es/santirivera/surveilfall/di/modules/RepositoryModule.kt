package es.santirivera.surveilfall.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import es.santirivera.surveilfall.data.net.NetworkManager
import es.santirivera.surveilfall.data.net.WServices
import es.santirivera.surveilfall.data.repository.AppRepository
import es.santirivera.surveilfall.data.repository.AppRepositoryImpl
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideAppRepository(
            context: Context,
            wServices: WServices,
            networkManager: NetworkManager): AppRepository {

        return AppRepositoryImpl(context,
                wServices,
                networkManager)
    }

}