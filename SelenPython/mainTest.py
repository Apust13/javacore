from selenium import webdriver
import pytest

@pytest.fixture
def driver(request):
    wd = webdriver.Chrome
    request.addfinalizer(wd.quit)
    return wd

def script(driver):
    driver.get("https://ya.ru")