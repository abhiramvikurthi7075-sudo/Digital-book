import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import App from './App.jsx'
import {
  createBrowserRouter,
  RouterProvider,
} from "react-router-dom";
import Header from './Components/Header';
import AddBook from './Components/AddBook.jsx';
import ViewBooks from './Components/ViewBooks.jsx';
import { ToastContainer } from 'react-toastify';
import Editbook from './Components/Editbook.jsx';
import Home from './Components/Home.jsx';
const router = createBrowserRouter([
  {
    path: "/",
    element: <Home/>,
  },

  {
    path: "/addbook",
    element: <AddBook/>,
  },

  {
    path: "/view",
    element: <ViewBooks/>,
  
  },
  {
    path: "/Edit/:id",
    element: <Editbook/>,
  }

]);

createRoot(document.getElementById('root')).render(
  <StrictMode>
    <RouterProvider router={router} />
    <ToastContainer/>
    <App />
  </StrictMode>,
)
export default router;
