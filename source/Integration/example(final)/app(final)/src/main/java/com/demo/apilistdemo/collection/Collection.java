package com.demo.apilistdemo.collection;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Justin on 2017/5/29.
 */

public class Collection {


    /**
     * id : 148984
     * title : Black & White
     * description : What is it about the absence of color that brings out drama and depth in photography?
     * published_at : 2016-03-03T02:36:31-05:00
     * updated_at : 2017-05-28T16:58:59-04:00
     * curated : false
     * featured : true
     * total_photos : 447
     * private : false
     * share_key : 1ee53a38018e5910f4d44c37fe71106a
     * cover_photo : {"id":"Zg14Kx1XVsc","created_at":"2017-05-27T15:50:46-04:00","updated_at":"2017-05-29T02:21:31-04:00","width":3168,"height":4752,"color":"#C4C4C4","likes":19,"liked_by_user":false,"user":{"id":"7BFLkRjHfyA","updated_at":"2017-05-29T02:30:24-04:00","username":"slavewire","name":"Alex Sheldon","first_name":"Alex","last_name":"Sheldon","portfolio_url":"http://www.the-photo-lounge.com","bio":"I sometimes take pictures.","location":"London, UK","total_likes":8,"total_photos":2,"total_collections":0,"profile_image":{"small":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=e4d00f89211780f4921955499fcc8cc1","medium":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=46e8a568ecec1005b9152f7f169eedf8","large":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=42788a328124e8c13e701a0c11ae7df5"},"links":{"self":"https://api.unsplash.com/users/slavewire","html":"http://unsplash.com/@slavewire","photos":"https://api.unsplash.com/users/slavewire/photos","likes":"https://api.unsplash.com/users/slavewire/likes","portfolio":"https://api.unsplash.com/users/slavewire/portfolio","following":"https://api.unsplash.com/users/slavewire/following","followers":"https://api.unsplash.com/users/slavewire/followers"}},"urls":{"raw":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f","full":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&s=df7bd875747309dc2a42d02588e65a4e","regular":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&s=61d567802f82c40216d7025c94bbfc9b","small":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&s=d799370dc6d4bfb3863ed98d02c39928","thumb":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&s=481f6b8101ea341e6cdf272775563080"},"categories":[],"links":{"self":"https://api.unsplash.com/photos/Zg14Kx1XVsc","html":"http://unsplash.com/photos/Zg14Kx1XVsc","download":"http://unsplash.com/photos/Zg14Kx1XVsc/download","download_location":"https://api.unsplash.com/photos/Zg14Kx1XVsc/download"}}
     * user : {"id":"PvjW2sBV594","updated_at":"2017-05-29T02:15:45-04:00","username":"timmossholder","name":"Tim Mossholder","first_name":"Tim","last_name":"Mossholder","portfolio_url":"http://about.me/timmossholder","bio":"Family man first. Pastor second. But I love finding time to explore photography -- and the Central Coast of California has some amazing places to do that. Thanks, Unsplash, for creating this space for sharing freely. ","location":"Santa Maria","followed_by_user":false,"total_likes":1070,"total_photos":106,"total_collections":23,"profile_image":{"small":"https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=8ea3341fdcd200308a163f8a9539f40f","medium":"https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=43f20477fd781d56a1daefc6d2f71010","large":"https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=0cc3059b9d6cae67432f9caf495cdca5"},"links":{"self":"https://api.unsplash.com/users/timmossholder","html":"http://unsplash.com/@timmossholder","photos":"https://api.unsplash.com/users/timmossholder/photos","likes":"https://api.unsplash.com/users/timmossholder/likes","portfolio":"https://api.unsplash.com/users/timmossholder/portfolio","following":"https://api.unsplash.com/users/timmossholder/following","followers":"https://api.unsplash.com/users/timmossholder/followers"}}
     * links : {"self":"https://api.unsplash.com/collections/148984","html":"http://unsplash.com/collections/148984/black-white","photos":"https://api.unsplash.com/collections/148984/photos","related":"https://api.unsplash.com/collections/148984/related"}
     */

    private int id;
    private String title;
    private String description;
    private String published_at;
    private String updated_at;
    private boolean curated;
    private boolean featured;
    private int total_photos;
    @SerializedName("private")
    private boolean privateX;
    private String share_key;
    private CoverPhotoBean cover_photo;
    private UserBeanX user;
    private LinksBeanXXX links;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public boolean isCurated() {
        return curated;
    }

    public void setCurated(boolean curated) {
        this.curated = curated;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    public int getTotal_photos() {
        return total_photos;
    }

    public void setTotal_photos(int total_photos) {
        this.total_photos = total_photos;
    }

    public boolean isPrivateX() {
        return privateX;
    }

    public void setPrivateX(boolean privateX) {
        this.privateX = privateX;
    }

    public String getShare_key() {
        return share_key;
    }

    public void setShare_key(String share_key) {
        this.share_key = share_key;
    }

    public CoverPhotoBean getCover_photo() {
        return cover_photo;
    }

    public void setCover_photo(CoverPhotoBean cover_photo) {
        this.cover_photo = cover_photo;
    }

    public UserBeanX getUser() {
        return user;
    }

    public void setUser(UserBeanX user) {
        this.user = user;
    }

    public LinksBeanXXX getLinks() {
        return links;
    }

    public void setLinks(LinksBeanXXX links) {
        this.links = links;
    }

    public static class CoverPhotoBean {
        /**
         * id : Zg14Kx1XVsc
         * created_at : 2017-05-27T15:50:46-04:00
         * updated_at : 2017-05-29T02:21:31-04:00
         * width : 3168
         * height : 4752
         * color : #C4C4C4
         * likes : 19
         * liked_by_user : false
         * user : {"id":"7BFLkRjHfyA","updated_at":"2017-05-29T02:30:24-04:00","username":"slavewire","name":"Alex Sheldon","first_name":"Alex","last_name":"Sheldon","portfolio_url":"http://www.the-photo-lounge.com","bio":"I sometimes take pictures.","location":"London, UK","total_likes":8,"total_photos":2,"total_collections":0,"profile_image":{"small":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=e4d00f89211780f4921955499fcc8cc1","medium":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=46e8a568ecec1005b9152f7f169eedf8","large":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=42788a328124e8c13e701a0c11ae7df5"},"links":{"self":"https://api.unsplash.com/users/slavewire","html":"http://unsplash.com/@slavewire","photos":"https://api.unsplash.com/users/slavewire/photos","likes":"https://api.unsplash.com/users/slavewire/likes","portfolio":"https://api.unsplash.com/users/slavewire/portfolio","following":"https://api.unsplash.com/users/slavewire/following","followers":"https://api.unsplash.com/users/slavewire/followers"}}
         * urls : {"raw":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f","full":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&s=df7bd875747309dc2a42d02588e65a4e","regular":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&s=61d567802f82c40216d7025c94bbfc9b","small":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&s=d799370dc6d4bfb3863ed98d02c39928","thumb":"https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&s=481f6b8101ea341e6cdf272775563080"}
         * categories : []
         * links : {"self":"https://api.unsplash.com/photos/Zg14Kx1XVsc","html":"http://unsplash.com/photos/Zg14Kx1XVsc","download":"http://unsplash.com/photos/Zg14Kx1XVsc/download","download_location":"https://api.unsplash.com/photos/Zg14Kx1XVsc/download"}
         */

        private String id;
        private String created_at;
        private String updated_at;
        private int width;
        private int height;
        private String color;
        private int likes;
        private boolean liked_by_user;
        private UserBean user;
        private UrlsBean urls;
        private LinksBeanX links;
        private List<?> categories;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getLikes() {
            return likes;
        }

        public void setLikes(int likes) {
            this.likes = likes;
        }

        public boolean isLiked_by_user() {
            return liked_by_user;
        }

        public void setLiked_by_user(boolean liked_by_user) {
            this.liked_by_user = liked_by_user;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public UrlsBean getUrls() {
            return urls;
        }

        public void setUrls(UrlsBean urls) {
            this.urls = urls;
        }

        public LinksBeanX getLinks() {
            return links;
        }

        public void setLinks(LinksBeanX links) {
            this.links = links;
        }

        public List<?> getCategories() {
            return categories;
        }

        public void setCategories(List<?> categories) {
            this.categories = categories;
        }

        public static class UserBean {
            /**
             * id : 7BFLkRjHfyA
             * updated_at : 2017-05-29T02:30:24-04:00
             * username : slavewire
             * name : Alex Sheldon
             * first_name : Alex
             * last_name : Sheldon
             * portfolio_url : http://www.the-photo-lounge.com
             * bio : I sometimes take pictures.
             * location : London, UK
             * total_likes : 8
             * total_photos : 2
             * total_collections : 0
             * profile_image : {"small":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=e4d00f89211780f4921955499fcc8cc1","medium":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=46e8a568ecec1005b9152f7f169eedf8","large":"https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=42788a328124e8c13e701a0c11ae7df5"}
             * links : {"self":"https://api.unsplash.com/users/slavewire","html":"http://unsplash.com/@slavewire","photos":"https://api.unsplash.com/users/slavewire/photos","likes":"https://api.unsplash.com/users/slavewire/likes","portfolio":"https://api.unsplash.com/users/slavewire/portfolio","following":"https://api.unsplash.com/users/slavewire/following","followers":"https://api.unsplash.com/users/slavewire/followers"}
             */

            private String id;
            private String updated_at;
            private String username;
            private String name;
            private String first_name;
            private String last_name;
            private String portfolio_url;
            private String bio;
            private String location;
            private int total_likes;
            private int total_photos;
            private int total_collections;
            private ProfileImageBean profile_image;
            private LinksBean links;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUpdated_at() {
                return updated_at;
            }

            public void setUpdated_at(String updated_at) {
                this.updated_at = updated_at;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFirst_name() {
                return first_name;
            }

            public void setFirst_name(String first_name) {
                this.first_name = first_name;
            }

            public String getLast_name() {
                return last_name;
            }

            public void setLast_name(String last_name) {
                this.last_name = last_name;
            }

            public String getPortfolio_url() {
                return portfolio_url;
            }

            public void setPortfolio_url(String portfolio_url) {
                this.portfolio_url = portfolio_url;
            }

            public String getBio() {
                return bio;
            }

            public void setBio(String bio) {
                this.bio = bio;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public int getTotal_likes() {
                return total_likes;
            }

            public void setTotal_likes(int total_likes) {
                this.total_likes = total_likes;
            }

            public int getTotal_photos() {
                return total_photos;
            }

            public void setTotal_photos(int total_photos) {
                this.total_photos = total_photos;
            }

            public int getTotal_collections() {
                return total_collections;
            }

            public void setTotal_collections(int total_collections) {
                this.total_collections = total_collections;
            }

            public ProfileImageBean getProfile_image() {
                return profile_image;
            }

            public void setProfile_image(ProfileImageBean profile_image) {
                this.profile_image = profile_image;
            }

            public LinksBean getLinks() {
                return links;
            }

            public void setLinks(LinksBean links) {
                this.links = links;
            }

            public static class ProfileImageBean {
                /**
                 * small : https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=e4d00f89211780f4921955499fcc8cc1
                 * medium : https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=46e8a568ecec1005b9152f7f169eedf8
                 * large : https://images.unsplash.com/profile-fb-1493560027-c9ee308bd421.jpg?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=42788a328124e8c13e701a0c11ae7df5
                 */

                private String small;
                private String medium;
                private String large;

                public String getSmall() {
                    return small;
                }

                public void setSmall(String small) {
                    this.small = small;
                }

                public String getMedium() {
                    return medium;
                }

                public void setMedium(String medium) {
                    this.medium = medium;
                }

                public String getLarge() {
                    return large;
                }

                public void setLarge(String large) {
                    this.large = large;
                }
            }

            public static class LinksBean {
                /**
                 * self : https://api.unsplash.com/users/slavewire
                 * html : http://unsplash.com/@slavewire
                 * photos : https://api.unsplash.com/users/slavewire/photos
                 * likes : https://api.unsplash.com/users/slavewire/likes
                 * portfolio : https://api.unsplash.com/users/slavewire/portfolio
                 * following : https://api.unsplash.com/users/slavewire/following
                 * followers : https://api.unsplash.com/users/slavewire/followers
                 */

                private String self;
                private String html;
                private String photos;
                private String likes;
                private String portfolio;
                private String following;
                private String followers;

                public String getSelf() {
                    return self;
                }

                public void setSelf(String self) {
                    this.self = self;
                }

                public String getHtml() {
                    return html;
                }

                public void setHtml(String html) {
                    this.html = html;
                }

                public String getPhotos() {
                    return photos;
                }

                public void setPhotos(String photos) {
                    this.photos = photos;
                }

                public String getLikes() {
                    return likes;
                }

                public void setLikes(String likes) {
                    this.likes = likes;
                }

                public String getPortfolio() {
                    return portfolio;
                }

                public void setPortfolio(String portfolio) {
                    this.portfolio = portfolio;
                }

                public String getFollowing() {
                    return following;
                }

                public void setFollowing(String following) {
                    this.following = following;
                }

                public String getFollowers() {
                    return followers;
                }

                public void setFollowers(String followers) {
                    this.followers = followers;
                }
            }
        }

        public static class UrlsBean {
            /**
             * raw : https://images.unsplash.com/photo-1495914510314-ba3164b1321f
             * full : https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=85&fm=jpg&crop=entropy&cs=srgb&s=df7bd875747309dc2a42d02588e65a4e
             * regular : https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&s=61d567802f82c40216d7025c94bbfc9b
             * small : https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=400&fit=max&s=d799370dc6d4bfb3863ed98d02c39928
             * thumb : https://images.unsplash.com/photo-1495914510314-ba3164b1321f?ixlib=rb-0.3.5&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=200&fit=max&s=481f6b8101ea341e6cdf272775563080
             */

            private String raw;
            private String full;
            private String regular;
            private String small;
            private String thumb;

            public String getRaw() {
                return raw;
            }

            public void setRaw(String raw) {
                this.raw = raw;
            }

            public String getFull() {
                return full;
            }

            public void setFull(String full) {
                this.full = full;
            }

            public String getRegular() {
                return regular;
            }

            public void setRegular(String regular) {
                this.regular = regular;
            }

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }
        }

        public static class LinksBeanX {
            /**
             * self : https://api.unsplash.com/photos/Zg14Kx1XVsc
             * html : http://unsplash.com/photos/Zg14Kx1XVsc
             * download : http://unsplash.com/photos/Zg14Kx1XVsc/download
             * download_location : https://api.unsplash.com/photos/Zg14Kx1XVsc/download
             */

            private String self;
            private String html;
            private String download;
            private String download_location;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public String getHtml() {
                return html;
            }

            public void setHtml(String html) {
                this.html = html;
            }

            public String getDownload() {
                return download;
            }

            public void setDownload(String download) {
                this.download = download;
            }

            public String getDownload_location() {
                return download_location;
            }

            public void setDownload_location(String download_location) {
                this.download_location = download_location;
            }
        }
    }

    public static class UserBeanX {
        /**
         * id : PvjW2sBV594
         * updated_at : 2017-05-29T02:15:45-04:00
         * username : timmossholder
         * name : Tim Mossholder
         * first_name : Tim
         * last_name : Mossholder
         * portfolio_url : http://about.me/timmossholder
         * bio : Family man first. Pastor second. But I love finding time to explore photography -- and the Central Coast of California has some amazing places to do that. Thanks, Unsplash, for creating this space for sharing freely.
         * location : Santa Maria
         * followed_by_user : false
         * total_likes : 1070
         * total_photos : 106
         * total_collections : 23
         * profile_image : {"small":"https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=8ea3341fdcd200308a163f8a9539f40f","medium":"https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=43f20477fd781d56a1daefc6d2f71010","large":"https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=0cc3059b9d6cae67432f9caf495cdca5"}
         * links : {"self":"https://api.unsplash.com/users/timmossholder","html":"http://unsplash.com/@timmossholder","photos":"https://api.unsplash.com/users/timmossholder/photos","likes":"https://api.unsplash.com/users/timmossholder/likes","portfolio":"https://api.unsplash.com/users/timmossholder/portfolio","following":"https://api.unsplash.com/users/timmossholder/following","followers":"https://api.unsplash.com/users/timmossholder/followers"}
         */

        private String id;
        private String updated_at;
        private String username;
        private String name;
        private String first_name;
        private String last_name;
        private String portfolio_url;
        private String bio;
        private String location;
        private boolean followed_by_user;
        private int total_likes;
        private int total_photos;
        private int total_collections;
        private ProfileImageBeanX profile_image;
        private LinksBeanXX links;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getPortfolio_url() {
            return portfolio_url;
        }

        public void setPortfolio_url(String portfolio_url) {
            this.portfolio_url = portfolio_url;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public boolean isFollowed_by_user() {
            return followed_by_user;
        }

        public void setFollowed_by_user(boolean followed_by_user) {
            this.followed_by_user = followed_by_user;
        }

        public int getTotal_likes() {
            return total_likes;
        }

        public void setTotal_likes(int total_likes) {
            this.total_likes = total_likes;
        }

        public int getTotal_photos() {
            return total_photos;
        }

        public void setTotal_photos(int total_photos) {
            this.total_photos = total_photos;
        }

        public int getTotal_collections() {
            return total_collections;
        }

        public void setTotal_collections(int total_collections) {
            this.total_collections = total_collections;
        }

        public ProfileImageBeanX getProfile_image() {
            return profile_image;
        }

        public void setProfile_image(ProfileImageBeanX profile_image) {
            this.profile_image = profile_image;
        }

        public LinksBeanXX getLinks() {
            return links;
        }

        public void setLinks(LinksBeanXX links) {
            this.links = links;
        }

        public static class ProfileImageBeanX {
            /**
             * small : https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=32&w=32&s=8ea3341fdcd200308a163f8a9539f40f
             * medium : https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=64&w=64&s=43f20477fd781d56a1daefc6d2f71010
             * large : https://images.unsplash.com/profile-1474504186457-d0b36ed789fb?ixlib=rb-0.3.5&q=80&fm=jpg&crop=faces&cs=tinysrgb&fit=crop&h=128&w=128&s=0cc3059b9d6cae67432f9caf495cdca5
             */

            private String small;
            private String medium;
            private String large;

            public String getSmall() {
                return small;
            }

            public void setSmall(String small) {
                this.small = small;
            }

            public String getMedium() {
                return medium;
            }

            public void setMedium(String medium) {
                this.medium = medium;
            }

            public String getLarge() {
                return large;
            }

            public void setLarge(String large) {
                this.large = large;
            }
        }

        public static class LinksBeanXX {
            /**
             * self : https://api.unsplash.com/users/timmossholder
             * html : http://unsplash.com/@timmossholder
             * photos : https://api.unsplash.com/users/timmossholder/photos
             * likes : https://api.unsplash.com/users/timmossholder/likes
             * portfolio : https://api.unsplash.com/users/timmossholder/portfolio
             * following : https://api.unsplash.com/users/timmossholder/following
             * followers : https://api.unsplash.com/users/timmossholder/followers
             */

            private String self;
            private String html;
            private String photos;
            private String likes;
            private String portfolio;
            private String following;
            private String followers;

            public String getSelf() {
                return self;
            }

            public void setSelf(String self) {
                this.self = self;
            }

            public String getHtml() {
                return html;
            }

            public void setHtml(String html) {
                this.html = html;
            }

            public String getPhotos() {
                return photos;
            }

            public void setPhotos(String photos) {
                this.photos = photos;
            }

            public String getLikes() {
                return likes;
            }

            public void setLikes(String likes) {
                this.likes = likes;
            }

            public String getPortfolio() {
                return portfolio;
            }

            public void setPortfolio(String portfolio) {
                this.portfolio = portfolio;
            }

            public String getFollowing() {
                return following;
            }

            public void setFollowing(String following) {
                this.following = following;
            }

            public String getFollowers() {
                return followers;
            }

            public void setFollowers(String followers) {
                this.followers = followers;
            }
        }
    }

    public static class LinksBeanXXX {
        /**
         * self : https://api.unsplash.com/collections/148984
         * html : http://unsplash.com/collections/148984/black-white
         * photos : https://api.unsplash.com/collections/148984/photos
         * related : https://api.unsplash.com/collections/148984/related
         */

        private String self;
        private String html;
        private String photos;
        private String related;

        public String getSelf() {
            return self;
        }

        public void setSelf(String self) {
            this.self = self;
        }

        public String getHtml() {
            return html;
        }

        public void setHtml(String html) {
            this.html = html;
        }

        public String getPhotos() {
            return photos;
        }

        public void setPhotos(String photos) {
            this.photos = photos;
        }

        public String getRelated() {
            return related;
        }

        public void setRelated(String related) {
            this.related = related;
        }
    }
}
