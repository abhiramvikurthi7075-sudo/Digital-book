import React, { useEffect,useState } from 'react'
import Header from './Header';
import axios from 'axios';
import { toast } from 'react-toastify';
import { useNavigate } from 'react-router-dom';
function AddBook(){
  const[title,settitle]=useState('');
  const[author,setauthor]=useState('');
  const[isbn,setisbn]=useState('');
  const[price,setprice]=useState('');
   const[publisher,setpublisher]=useState('');
   const[noc,setnoc]=useState('');
   const[nop,setnop]=useState('');
  
let nav = useNavigate();

let viewbook=(e) =>{
 e. preventDefault();
 axios.post('http://localhost:4000/books',{title,author,isbn,price,publisher,noc,nop}).then(()=>{
  // alert("Addbook")
  nav("/view")
 }).catch((err)=>{
// alert((err));
   toast.err('sever is not valid',{
    postion :'top-right',
    autoclose:2000
   });
 }); 

 }





   
  return (
  <>
  <Header />
    <div className="add"> 
      <div className="add-book-container">
        
        <h1>#AddBook</h1>
        
        <form method='post' onSubmit={viewbook}>
        <div className="inputs">
          <input type="text" placeholder="Enter Title" 
           onChange={(e) => settitle(e.target.value)} 
            />
  
          <input type="text" placeholder="Enter Author Name" 
          onChange={(e)=> setauthor(e.target.value)}
          
          />
          <input type="text" placeholder="Enter Isbn number" 
          onChange={(e)=> setisbn(e.target.value)}

          />
          <input type="text" placeholder="Enter Price" 
          onChange={(e)=> setprice(e.target.value)}
          />
          <input type="text" placeholder="Enter Publisher" 
          onChange={(e)=> setpublisher(e.target.value)}
           />
          <input type="text" placeholder="Enter Noc" 
          onChange={()=> setnoc(e.target.value)}
           />
          <input type="text" placeholder="Enter Nop" 
          onChange={()=> setnop(e.target.value)}
          />
          <button className="submit-button" onclick={()=>(submit)}>Submit</button>
        </div>
      </form>

      </div>
    </div>
    
    </>
  );
}

export default AddBook;

