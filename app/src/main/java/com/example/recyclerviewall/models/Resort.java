package com.example.recyclerviewall.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Resort implements Parcelable {

    private String name, elevation, photo, description, location;

    public Resort() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElevation() {
        return elevation;
    }

    public void setElevation(String elevation) {
        this.elevation = elevation;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    protected Resort(Parcel in) {
        name = in.readString();
        elevation = in.readString();
        photo = in.readString();
        description = in.readString();
        location = in.readString();
    }

    public static final Creator<Resort> CREATOR = new Creator<Resort>() {
        @Override
        public Resort createFromParcel(Parcel in) {
            return new Resort(in);
        }

        @Override
        public Resort[] newArray(int size) {
            return new Resort[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(elevation);
        dest.writeString(photo);
        dest.writeString(description);
        dest.writeString(location);
    }
}
