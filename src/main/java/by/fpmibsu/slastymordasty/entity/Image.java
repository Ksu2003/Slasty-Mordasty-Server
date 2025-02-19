package by.fpmibsu.slastymordasty.entity;

import java.util.Objects;

public class Image extends Entity{

    String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Image(long id,String path) {
        this.path = path;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Image)) return false;

        if (!Objects.equals(this.path, ((Image) o).path)) return false;
        if(this.id != ((Image) o).getId()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return getPath() != null ? getPath().hashCode() : 0;
    }

    public Image(){

    }

    @Override
    public String toString() {
        return "Image{" +
                "path='" + path + '\'' +
                ", id=" + id +
                '}';
    }
}
