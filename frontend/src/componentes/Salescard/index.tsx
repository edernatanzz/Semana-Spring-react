
import NotificationButton from '../NotificationBOtton';
import './styles.css';

function Salescard() {
    return (
        <>
            <div className="dsmeta-card">
                <h2 className="dsmeta-titulo-vendas">Vendas</h2>
                <div>
                    <div className="dsmeta-caixa-texto">
                        <input className="dsmeta-form-control" type="text" />
                        <div className="dsmeta-caixa-texto">
                            <input className="dsmeta-form-control" type="text" />
                        </div>
                    </div>



                    <div>
                        <table className="dsmeta-saldo-tabela">
                            <thead>
                                <tr>
                                    <th className="sumir992">ID</th>
                                    <th className="sumir576">Data</th>
                                    <th>Vendedor </th>
                                    <th className="sumir992">Visitas</th>
                                    <th className="sumir992">Vendas</th>
                                    <th> Total </th>
                                    <th> Notificar </th>
                                </tr>
                            </thead>
                            <tbody>


                                <tr>
                                    <th className="sumir992">#341</th>
                                    <th className="sumir576"> 09/07/2022 </th>
                                    <th> Eder </th>
                                    <th className="sumir992">15</th>
                                    <th className="sumir992">11</th>
                                    <th> R$ 55300.00</th>
                                    <th>
                                        <div className="dsmeta-botao-vermelho-container">
                                            <NotificationButton />
                                        </div>

                                    </th>
                                </tr>
                                <tr>
                                    <th className="sumir992">#341</th>
                                    <th className="sumir576"> 09/07/2022 </th>
                                    <th> Eder </th>
                                    <th className="sumir992">15</th>
                                    <th className="sumir992">11</th>
                                    <th> R$ 55300.00</th>
                                    <th>
                                        <div className="dsmeta-botao-vermelho-container">
                                            <NotificationButton />
                                        </div>
                                    </th>
                                </tr>
                                <tr>
                                    <th className="sumir992">#341</th>
                                    <th className="sumir576"> 09/07/2022 </th>
                                    <th> Eder </th>
                                    <th className="sumir992">15</th>
                                    <th className="sumir992">11</th>
                                    <th> R$ 55300.00</th>
                                    <th>
                                        <div className="dsmeta-botao-vermelho-container">
                                            <NotificationButton />
                                        </div>


                                    </th>
                                </tr>

                                <tr>
                                    <th className="sumir992">#341</th>
                                    <th className="sumir576"> 09/07/2022 </th>
                                    <th> Eder </th>
                                    <th className="sumir992">15</th>
                                    <th className="sumir992">11</th>
                                    <th> R$ 55300.00</th>
                                    <th>
                                        <div className="dsmeta-botao-vermelho-container">
                                            <NotificationButton />
                                        </div>


                                    </th>
                                </tr>

                                <tr>
                                    <th className="sumir992">#341</th>
                                    <th className="sumir576"> 09/07/2022 </th>
                                    <th> Eder </th>
                                    <th className="sumir992">15</th>
                                    <th className="sumir992">11</th>
                                    <th> R$ 55300.00</th>
                                    <th>
                                        <div className="dsmeta-botao-vermelho-container">
                                            <NotificationButton />
                                        </div>


                                    </th>
                                </tr>

                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

        </>
    )

}
export default Salescard