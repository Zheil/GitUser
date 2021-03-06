package com.zheil.gituser.data.model


import com.google.gson.annotations.SerializedName;

data class GitUserModel (
    @SerializedName("login") var login: String,
    @SerializedName("id") var id: Int,
    @SerializedName("node_id") var nodeId: String,
    @SerializedName("avatar_url") var avatarUrl:String,
    @SerializedName("gravatar_id") var gravatarId:String,
    @SerializedName("url") var url:String,
    @SerializedName("html_url") var htmlUrl:String,
    @SerializedName("followers_url") var followersUrl:String,
    @SerializedName("following_url") var followingUrl:String,
    @SerializedName("gists_url") var gistsUrl:String,
    @SerializedName("starred_url") var starredUrl:String,
    @SerializedName("subscriptions_url") var subscriptionsUrl:String,
    @SerializedName("organizations_url") var organizationsUrl:String,
    @SerializedName("repos_url") var reposUrl:String,
    @SerializedName("events_url") var eventsUrl:String,
    @SerializedName("received_events_url") var receivedEventsUrl:String,
    @SerializedName("type") var type:String,
    @SerializedName("site_admin") var siteAdmin:Boolean,
    @SerializedName("name") var name:String,
    @SerializedName("company") var company:Any,
    @SerializedName("blog") var blog:String,
    @SerializedName("location") var location:Any,
    @SerializedName("email") var email:Any,
    @SerializedName("hireable") var hireable:Any,
    @SerializedName("bio") var bio:Any,
    @SerializedName("public_repos") var publicRepos:Int,
    @SerializedName("public_gists") var publicGists:Int,
    @SerializedName("followers") var followers:Int,
    @SerializedName("following") var following:Int,
    @SerializedName("created_at") var createdAt:String,
    @SerializedName("updated_at") var updatedAt:String
)

data class GitUserShortModel (
        @SerializedName("login") var login: String,
        @SerializedName("id") var id: Int,
        @SerializedName("avatar_url") var avatarUrl:String,
        @SerializedName("url") var url:String,
        @SerializedName("html_url") var htmlUrl:String,
        @SerializedName("name") var name:String,
        @SerializedName("email") var email:Any,
        @SerializedName("created_at") var createdAt:String,
        @SerializedName("updated_at") var updatedAt:String
)