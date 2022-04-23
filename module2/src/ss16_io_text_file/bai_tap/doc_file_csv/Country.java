package ss16_io_text_file.bai_tap.doc_file_csv;

public class Country {
    private Integer id;
    private String name;
    private String nameFull;

    public Country() {
    }

    public Country(Integer id, String name, String nameFull) {
        this.id = id;
        this.name = name;
        this.nameFull = nameFull;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id:" + id +
                ", name:" + name + '\'' +
                ", nameFull:" + nameFull + '\'' +
                '}';
    }
}
