.class public final Lk3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public b:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lk3/k;->b:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
