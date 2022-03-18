import React from "react";
import Filters from "../../components/Filters";
import './styles.css';
import { barOptions, pieOptions } from './chart-options';
import Chart from 'react-apexcharts';

const chartData = [
    {
        x:'Carlos',
        y:10
    },
    {
        x:'Valcy',
        y:20
    }
]

const Charts = () => {
    return (
        <div className="page-container">
            <Filters link="/records" linkText="VER TABELA" />

            <div className="chart-container">
                <div className="top-related">
                    <h1 className="top-related-title">
                        Jogos mais votados
                    </h1>
                    <div className="games-container">
                        <Chart
                            options={ barOptions }
                            type="bar"
                            width="100%"
                            height="auto"
                            series={[{ data: chartData }]}
                        />
                    </div>
                </div>
                <div className="charts">
                    <div className="platform-chart">
                        <h2 className="chart-title">Plataformas</h2>
                        <Chart
                            type="donut"
                            series={[30,70]}
                            width="100%"  
                            options={{ ...pieOptions, labels: ['Carlos', 'Valcy'] }} 
                        />
                    </div>
                    <div className="gender-chart">
                        <h2 className="chart-title">Gêneros</h2>
                        <Chart
                            type="donut"
                            series={[50,50]}
                            width="100%"  
                            options={{ ...pieOptions, labels: ['Carlos', 'Valcy'] }} 
                        />
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Charts;