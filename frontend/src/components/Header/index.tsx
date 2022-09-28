import logo from '../../assets/img/logo.svg';
import './style.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="imagem de logo"/>
                <h1>DSMeta</h1>
                <p>Desenvolvido por <a className="my-link" href="https://github.com/teteUser/ds-meta" target="_blank">Tennison Capra</a>.</p>
            </div>
        </header>
    )
  }
  
  export default Header;