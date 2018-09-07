import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

class JavaLecture {
    // Sigh. In Java the @NotNull annotation is just a suggestion. NPE, here we come!
    JavaStudent aStudent = new JavaStudent(1, null, null, null);
}


class JavaStudent {
    private final Integer id;
    private final String name;
    private  String nickName = null;
    private  Number bribeAmount = null;

    public JavaStudent(@NotNull Integer id, @NotNull String name, @Nullable String nickName, @Nullable Number bribeAmount) {
        this.id = id;
        this.name = name;
        this.nickName =  nickName;
        this.bribeAmount = bribeAmount;

    }

    public JavaStudent(@NotNull Integer id, @NotNull String name, @Nullable String nickName) {
        this.id = id;
        this.name = name;
        this.nickName =  nickName;
        this.bribeAmount = bribeAmount;

    }

    public JavaStudent(@NotNull Integer id, @NotNull String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Number getBribeAmount() {
        return bribeAmount;
    }

    public void setBribeAmount(Number bribeAmount) {
        this.bribeAmount = bribeAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaStudent that = (JavaStudent) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(nickName, that.nickName) &&
                Objects.equals(bribeAmount, that.bribeAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nickName, bribeAmount);
    }

    @Override
    public String toString() {
        return "JavaStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", bribeAmount=" + bribeAmount +
                '}';
    }

    // A couple examples of the many overloads of copy you would need to create to achieve the same
    // flexiblity of kotlin's generated copy method for data classes.
    public JavaStudent copy(@NotNull Integer id, @NotNull String name, @Nullable String nickName) {
        return new JavaStudent(id, name, nickName, this.bribeAmount);
    }

    public JavaStudent copy(@NotNull Integer id, @NotNull String name) {
        return new JavaStudent(id, name, this.nickName, this.bribeAmount);
    }

    // data classes also generate componentN() methods to support destructuring!

}
