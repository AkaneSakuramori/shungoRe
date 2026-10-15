.class public final enum Lt3/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lt3/f0;

.field public static final enum d:Lt3/f0;

.field public static final enum e:Lt3/f0;

.field public static final enum f:Lt3/f0;

.field public static final enum g:Lt3/f0;

.field public static final synthetic h:[Lt3/f0;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lt3/f0;

    const-string v1, "TLSv1.3"

    const-string v2, "TLS_1_3"

    const/4 v3, 0x0

    invoke-direct {v0, v3, v2, v1}, Lt3/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lt3/f0;->c:Lt3/f0;

    new-instance v1, Lt3/f0;

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    const/4 v4, 0x1

    invoke-direct {v1, v4, v3, v2}, Lt3/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v1, Lt3/f0;->d:Lt3/f0;

    new-instance v2, Lt3/f0;

    const-string v3, "TLSv1.1"

    const-string v4, "TLS_1_1"

    const/4 v5, 0x2

    invoke-direct {v2, v5, v4, v3}, Lt3/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v2, Lt3/f0;->e:Lt3/f0;

    new-instance v3, Lt3/f0;

    const-string v4, "TLSv1"

    const-string v5, "TLS_1_0"

    const/4 v6, 0x3

    invoke-direct {v3, v6, v5, v4}, Lt3/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lt3/f0;->f:Lt3/f0;

    new-instance v4, Lt3/f0;

    const-string v5, "SSLv3"

    const-string v6, "SSL_3_0"

    const/4 v7, 0x4

    invoke-direct {v4, v7, v6, v5}, Lt3/f0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sput-object v4, Lt3/f0;->g:Lt3/f0;

    filled-new-array {v0, v1, v2, v3, v4}, [Lt3/f0;

    move-result-object v0

    sput-object v0, Lt3/f0;->h:[Lt3/f0;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lt3/f0;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt3/f0;
    .locals 1

    const-class v0, Lt3/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt3/f0;

    return-object p0
.end method

.method public static values()[Lt3/f0;
    .locals 1

    sget-object v0, Lt3/f0;->h:[Lt3/f0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt3/f0;

    return-object v0
.end method
