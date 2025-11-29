package com.rudra.smallshopkeeper.data.repository

import com.rudra.smallshopkeeper.data.entities.ActivityEntity
import kotlinx.coroutines.flow.Flow

interface ActivityRepository {

    fun getAllActivities(): Flow<List<ActivityEntity>>

    suspend fun insertActivity(activity: ActivityEntity)
}