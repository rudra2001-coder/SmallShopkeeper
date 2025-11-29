package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.dao.ActivityDao
import com.rudra.smallshopkeeper.data.entities.ActivityEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ActivityRepositoryImpl @Inject constructor(
    private val activityDao: ActivityDao
) : ActivityRepository {

    override fun getAllActivities(): Flow<List<ActivityEntity>> = activityDao.getAllActivities()

    override suspend fun insertActivity(activity: ActivityEntity) {
        activityDao.insertActivity(activity)
    }
}