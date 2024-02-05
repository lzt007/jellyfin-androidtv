package org.jellyfin.androidtv.data.model

import kotlinx.serialization.Serializable
import org.jellyfin.sdk.model.api.BaseItemDto

@Serializable
data class ChannelsWithGroups(
    val TotalCount: Int,
    val Name: String?,
    val Channels: List<BaseItemDto>
)
