import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import Home from './Home';

const Footer = (props) => {

    const [data, setdata] = useState([])

    useEffect(() => {
        axios.get("http://localhost:4000/books").then((res) => {
            setdata(res.data)
        })
    })

    return (


        <>
            <div className="container mt-4">
                <div className="row gy-4">
                    {data && data.map((item) => {
                        return (
                            
                                <div class="col-sm-4 col-md-6 mb-3 mb-sm-0">
                                    <div class="card">
                                        <div class="card-body">
                                            <h5 class="card-title"> Title:{item.title}</h5>
                                            <p class="card-text">Author:{item.author}</p>
                                            <a href="#" class="">Price:{item.price}</a>
                                        </div>
                                    </div>
                                </div>
                           

                        )
                    })}



                </div>
            </div>

        </>

    )
}

export default Footer
