package com.example.shopinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun deleteShopItem(shopItem: ShopItem)

    fun getShopList() : List<ShopItem>
}