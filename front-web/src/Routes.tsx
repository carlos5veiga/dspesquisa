import React from "react";
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './pages/Home';
import Header from './components/Header';
import Records from './pages/Records';

const AppRoutes = () => (
    <BrowserRouter>
        <Header />
        <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/Records" element={<Records />} />
        </Routes>
    </BrowserRouter>
);

export default AppRoutes;