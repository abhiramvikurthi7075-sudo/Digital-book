import axios from "axios";
import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";
import Header from "./Header";
import Editbook from "./Editbook";

function ViewBooks(props) {
  let[books,setbooks] = useState();
   let Navigate =useNavigate();
    useEffect(()=>{
      axios.get('http://localhost:4000/books').then((res)=>{
        setbooks(res.data);

      }).catch((err)=>{
        alert(err);
      })});

let Editbook =(id)=>{
   Navigate("/Edit/" +id)
}
  return (

    <>
     <Header/>
        <div className="container">
          <div className="row">
            <div className="col-12">
              <table className="table table-striped">
                <thead>
                  <tr>
                    <th>Title</th>
                    <th>Author</th>
                    <th>ISBN</th>
                    <th>Price</th>
                    <th>Publisher</th>
                    <th>Actions</th>
                  </tr>
                </thead>
                <tbody>
                  {
                    books && books.map( (book) => {

                      return(
                        <tr>
                          <td>{book.title}</td>
                          <td>{book.author}</td>
                          <td>{book.isbn}</td>
                          <td>{book.price}</td>
                          <td>{book.publisher}</td>
                          <td>
                            <a href=""target="_blank"
                            onClick={()=> Editbook(book.id)}
                             className="btn btn-success">Edit</a>
                            <a href=""
                            onClick={()=> Editbook(book.id)}
                             className="btn btn-danger">Delete</a>
                          </td>
                        </tr>
                      )

                    })
                  }
                </tbody>
              </table>
            </div>
          </div>
        </div>
 
        </>
  )
}

export default ViewBooks;

