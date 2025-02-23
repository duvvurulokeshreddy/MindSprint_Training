import { useEffect, useState } from "react";
import axios from 'axios';
import { Link } from "react-router-dom";
function Products(){

    const [products,setProducts]=useState([]);
    const fetchData= async () => {
        try{
            const resp=await axios.get('https://dummyjson.com/products');
            console.log(resp)
            setProducts(resp.data.products)
        }
        catch(error){
            console.log(error)
        }
    }
    // this effect will be execute only when the component label
    useEffect(() => {
        fetchData();
    },[])
    return (
        <div>
            <h3 className="text-center p-2 text-bg-secondary">Product Page</h3>
            <div className='row'>
                {
                    products.map(product=>(
                        <div className='col-lg-4 col-md-6'>
                            <h3>{product.title}</h3>
                            <Link to={`/products/${product.id}`}>
                            <img src={product.thumbnail} alt={product.title} />
                            </Link>
                            <p>${product.price}</p>
                            <p>Rating: {product.rating}</p>
                            <button className="btn btn-primary">Add To Cart</button>
                        </div>
                    ))
                }
            </div>
        </div>
    )
}

export default Products;