package com.product;

public class Category {
    private Integer category_id;
    private String category;
    private String tag;
    // 1 = activo, 0 = eliminado
    private Integer status; 

    /*
     * Metodo Constructor
     */
    public Category(Integer category_id, String category, String tag, Integer status ) {
        this.category_id = category_id;
        this.category = category;
        this.tag = tag;
        this.status = status; 
    }

    /*
     * Metodos get
     */
    public Integer getCategoryId(){
        
         return category_id;
    }

    public String getCategory(){
        return category;
    }

    public String getTag(){
        return tag;
    }

    public Integer getStatus(){
        return status;
    }

    /*
     * Metodos set
     */
    public void setStatus(Integer status){
        this.status = status; 

    }
              
    @Override
    public String toString() {
        return "{" + category_id + ", \"" + category + "\", \"" + tag + "\", " + status + "}";
    }
}
