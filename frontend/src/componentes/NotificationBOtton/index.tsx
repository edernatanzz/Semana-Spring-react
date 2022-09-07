import icon from '../../assets/img/notificationincon.svg';
import './styles.css';

function NotificationButton() {
    return (
        <>
            <div className="dsmeta-botao-vermelho">
                <img src={icon } alt="Notificar"/>
            </div>

        </>
    )
}

export default NotificationButton;
