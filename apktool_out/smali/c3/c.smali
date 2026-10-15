.class public final Lc3/c;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# static fields
.field public static final d:Lc3/c;

.field public static final e:Lc3/c;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lc3/c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lc3/c;-><init>(I)V

    sput-object v0, Lc3/c;->d:Lc3/c;

    new-instance v0, Lc3/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc3/c;-><init>(I)V

    sput-object v0, Lc3/c;->e:Lc3/c;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc3/c;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lc3/c;->c:I

    const-string v1, "element"

    const-string v2, "acc"

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc3/k;

    check-cast p2, Lc3/i;

    invoke-static {p1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Lc3/i;->getKey()Lc3/j;

    move-result-object v0

    invoke-interface {p1, v0}, Lc3/k;->t(Lc3/j;)Lc3/k;

    move-result-object p1

    sget-object v0, Lc3/l;->b:Lc3/l;

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v1, Lc3/f;->b:Lc3/f;

    invoke-interface {p1, v1}, Lc3/k;->e(Lc3/j;)Lc3/i;

    move-result-object v2

    check-cast v2, Lc3/g;

    if-nez v2, :cond_1

    new-instance v0, Lc3/d;

    invoke-direct {v0, p2, p1}, Lc3/d;-><init>(Lc3/i;Lc3/k;)V

    :goto_0
    move-object p2, v0

    goto :goto_1

    :cond_1
    invoke-interface {p1, v1}, Lc3/k;->t(Lc3/j;)Lc3/k;

    move-result-object p1

    if-ne p1, v0, :cond_2

    new-instance p1, Lc3/d;

    invoke-direct {p1, v2, p2}, Lc3/d;-><init>(Lc3/i;Lc3/k;)V

    move-object p2, p1

    goto :goto_1

    :cond_2
    new-instance v0, Lc3/d;

    new-instance v1, Lc3/d;

    invoke-direct {v1, p2, p1}, Lc3/d;-><init>(Lc3/i;Lc3/k;)V

    invoke-direct {v0, v2, v1}, Lc3/d;-><init>(Lc3/i;Lc3/k;)V

    goto :goto_0

    :goto_1
    return-object p2

    :pswitch_0
    check-cast p1, Ljava/lang/String;

    check-cast p2, Lc3/i;

    invoke-static {p1, v2}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lc3/h;->b0(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
