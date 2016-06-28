package com.fangxu.dota2helper.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "GREEN_VIDEO".
 */
public class GreenVideo {

    private Long id;
    private String videolistjson;
    private String videotype;

    public GreenVideo() {
    }

    public GreenVideo(Long id) {
        this.id = id;
    }

    public GreenVideo(Long id, String videolistjson, String videotype) {
        this.id = id;
        this.videolistjson = videolistjson;
        this.videotype = videotype;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideolistjson() {
        return videolistjson;
    }

    public void setVideolistjson(String videolistjson) {
        this.videolistjson = videolistjson;
    }

    public String getVideotype() {
        return videotype;
    }

    public void setVideotype(String videotype) {
        this.videotype = videotype;
    }

}
