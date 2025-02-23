// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from '/vite.svg'
// import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Footer from "./components/footer"
import Header from "./components/header"
import Contact from './components/contact'
import About from './components/about'
import Home from './components/home'
import Users from './components/users'
import Login from './components/login'
import Products from './components/product'
import ProductDetails from './components/productDetails'
import Register from './components/register'

function App() {
  // const [count, setCount] = useState(0)

  return (
    <BrowserRouter>
      <div className="container">
        <h1>This My First App</h1>
        <Header />
        <Routes>
          <Route path='home' element={<Home />} />
          <Route path='about' element={<About />} />
          <Route path='contact' element={<Contact />} />
          <Route path='users' element={<Users />} />
          <Route path='login' element={<Login />}/>
          <Route path='product' element={<Products />}/>
          <Route path='products/:id' element={<ProductDetails />}/>
          <Route path='register' element={<Register />}/>
        </Routes>
        <Footer />
      </div>
    </BrowserRouter>
  )
}

export default App
