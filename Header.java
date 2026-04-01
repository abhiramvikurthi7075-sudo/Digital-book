import React from 'react'
import './AddBook'
import './ViewBooks'

function Header() {
    const AddBook = (e)=>{
    e.preventDefault();
    
    }
  return (
    <div className="layouts">
    <div className="layout">
    <div className="container">
<div class="main">

    <div class="Home">
      <div class="one">
      <h1>Book Library</h1>
    </div>
    </div>
    <div className="row">
    {/* <div class="two">
      <a href="/" className='text-deccoration-none'>Home</a>
    </div>
    <div class="three">
      <a href="/addbook" className='text-decoration-none'>AddBook</a>
    </div>
    <div class="four">
      <a href="/View" className='text-decoration-none'>ViewBooks</a>
    </div> */}


    <nav class="navbar navbar-expand-lg">
  <div class="container-fluid">
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="/">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/addbook">AddBook</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/View">ViewBooks</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
    </div>
    </div>
    </div>
    </div>
    <div className="container1">
      <div className="Welcome">
      <h1>Welcome to home book</h1>
      </div>
    </div>

    </div>

  )
}

export default Header
