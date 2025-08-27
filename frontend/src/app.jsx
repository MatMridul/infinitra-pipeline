// frontend/src/App.jsx
import { useEffect, useState } from 'react'

function App() {
  const [message, setMessage] = useState('Loading...')

  useEffect(() => {
    // Call FastAPI via Vite proxy
    fetch('/api/health')
      .then((res) => {
        if (!res.ok) throw new Error(`${res.status} ${res.statusText}`)
        return res.json()
      })
      .then((data) => setMessage(JSON.stringify(data)))
      .catch((err) => setMessage('Error: ' + err.message))
  }, [])

  return (
    <div>
      <h1>Hi Infinitra!</h1>
      {/*<p>{message}</p>*/}
    </div>
  )
}

export default App
