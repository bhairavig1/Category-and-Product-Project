# Category-and-Product-Project
In this repository I am adding my Category and Product project, 

** Postman call for category: **

* for adding data to database in json format (url): http://localhost:8080/api/catagory/addData *
```
Json format: {
    "cid": "d650",
    "cname": "home decor",
    "prod": [
        {
            "pid": "uu78",
            "pname": "utensils",
            "pmanufacturedate": "20/01/2025",
            "pexpirydate": "till good in condition"
        }
    ]
}
```
* for pagination (url): http://localhost:8080/api/product/getAllCat?pageNumber=3&pageSize=1 * do not forget to add pageSize as it has been used a variable to determin how many recoreds user wants to be displayed

* for retrieving data from database by category id (url): http://localhost:8080/api/catagory/getCat/f123 *

* for updating category data by id(url): http://localhost:8080/api/catagory/update/h987 *


** Postman call for Product: **

* for adding data to database in json format (url): http://localhost:8080/api/product/addproduct *

* for getting data from database by id(url): http://localhost:8080/api/product/getdata/f242 *

* for updating product data by id(url): http://localhost:8080/api/product/updateProduct/e456 *

* for deleting product data by id (url) : http://localhost:8080/api/product/deleteproduct/k123 *

* for pagination (url): http://localhost:8080/api/product/getAllProduct?pageNumber=2&pageSize=3   do not forget to add pageSize as it has been used a variable to determin how many recoreds user wants to be displayed


