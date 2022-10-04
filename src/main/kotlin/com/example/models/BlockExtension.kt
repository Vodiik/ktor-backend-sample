package com.example.models

fun Block.toDto(): BlockDto =
    BlockDto(
        id = this.id.toString(),
        uid = this.uid,
        parentUid = this.parentUid,
        width = this.width,
        height = this.height,
        imageUri = this.imageUri,
        owner = this.owner,
        price = this.price,
        label = this.label,
        children = this.children
    )

fun BlockDto.toBlock(): Block =
    Block(
        uid = this.uid,
        parentUid = this.parentUid,
        width = this.width,
        height = this.height,
        imageUri = this.imageUri,
        owner = this.owner,
        price = this.price,
        label = this.label,
        children = this.children
    )