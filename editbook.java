import axios from 'axios';
import React, {useEffect, useState} from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import AddBook from './AddBook';

function Editbook  ()  {
    let {id} =useParams();
    let navigate =useNavigate();

     const[title,settitle]=useState('');
      const[author,setauthor]=useState('');
      const[isbn,setisbn]=useState('');
      const[price,setprice]=useState('');
       const[publisher,setpublisher]=useState('');
    //    const[noc,setnoc]=useState('');
       const[nop,setnop]=useState('');
    

    useEffect(()=>{
        axios.get('http://localhost:4000/books/'+id).then((res)=>{
            // console.log(res);
            settitle(res.data.title);
            setauthor(res.data.author);
            setisbn(res.data.isbn);
            setprice(res.data.price);
            setpublisher(res.data.publisher);
            // setnoc(res.data.noc);
            setnop(res.data.nop);
        }).catch((err)=>{
            alert(err);

        });
    },[]);
    let Editbook =(e)=>{
        e.preventDefault();
        axios.put('http://localhost:4000/books/'+id,{title,author,isbn,price,publisher,nop})
        .then((res)=>{
            navigate("/View");

        }).
        catch((err)=>{
            alert(err);
        })
    }

  return (
      <>
        <h1 className="book">AddBook</h1>
         <div className="add-container">
        <form onSubmit={Editbook}className="text-center">
        <div className="inputs">
          <input type="text" placeholder="Enter Title" 
           onChange={(e) => settitle(e.target.value)} 
           defaultValue={title}
            />
  
          <input type="text" placeholder="Enter Author Name" 
          onChange={(e)=> setauthor(e.target.value)}
          defaultValue={author}
          />
          <input type="text" placeholder="Enter Isbn number" 
          onChange={(e)=> setisbn(e.target.value)}
          defaultValue={isbn}
          />
          <input type="text" placeholder="Enter Price" 
          onChange={(e)=> setprice(e.target.value)}
          defaultValue={price}
          />
          <input type="text" placeholder="Enter Publisher" 
          onChange={(e)=> setpublisher(e.target.value)}
          defaultValue={publisher}
           />
          {/* <input type="text" placeholder="Enter Noc" 
          onChange={()=> setnoc(e.target.value)}
           /> */}
          <input type="text" placeholder="Enter Nop" 
          onChange={()=> setnop(e.target.value)}
          defaultValue={nop}
          />
          <button className="submit-button">Submit</button>
        </div>
        {/* </div> */}
      </form>
      </div>

      </>
  )
}

export default Editbook;
