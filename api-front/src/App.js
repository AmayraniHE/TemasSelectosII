import React, { useState } from 'react';

const App = () => {
  const [city, setCity] = useState('');
  const [weather, setWeather] = useState('');
  const [currency, setCurrency] = useState('');
  const [rate, setRate] = useState('');
  const [query, setQuery] = useState('');
  const [books, setBooks] = useState('');

  const fetchWeather = async () => {
    const response = await fetch(`/api/weather/current?city=${city}`);
    const data = await response.json();
    setWeather(JSON.stringify(data));
  };

  const fetchRate = async () => {
    const response = await fetch(`/api/bank/rate?currency=${currency}`);
    const data = await response.json();
    setRate(JSON.stringify(data));
  };

  const fetchBooks = async () => {
    const response = await fetch(`/api/books/search?query=${query}`);
    const data = await response.json();
    setBooks(JSON.stringify(data));
  };

  return (
    <div className="grid grid-cols-3 gap-4 p-4">
      <div className="p-4 border rounded shadow">
        <h2>Weather API</h2>
        <input type="text" value={city} onChange={(e) => setCity(e.target.value)} placeholder="Introducir ciudad" />
        <button onClick={fetchWeather}>Obtener clima</button>
        <pre>{weather}</pre>
      </div>

      <div className="p-4 border rounded shadow">
        <h2>Bank API</h2>
        <input type="text" value={currency} onChange={(e) => setCurrency(e.target.value)} placeholder="Introducir divisa (USD, EUR, etc.)" />
        <button onClick={fetchRate}>Obtener cambio</button>
        <pre>{rate}</pre>
      </div>

      <div className="p-4 border rounded shadow">
        <h2>Books API</h2>
        <input type="text" value={query} onChange={(e) => setQuery(e.target.value)} placeholder="Buscar libros" />
        <button onClick={fetchBooks}>Buscar</button>
        <pre>{books}</pre>
      </div>
    </div>
  );
};

export default App;
