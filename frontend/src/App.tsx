
import Header from "./componentes/header"
import Salescard from "./componentes/Salescard"
 
function App() {
    return (
        <>
            < Header />
            <main>
                <section id="vendas">
                    <div className="dsmeta-largura">
                    <Salescard/>

                    </div>
                </section>
            </main>
       </>
    )
}

export default App
