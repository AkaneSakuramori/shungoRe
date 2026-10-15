.class public final Lr3/h;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/p;


# static fields
.field public static final d:Lr3/h;

.field public static final e:Lr3/h;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lr3/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr3/h;-><init>(I)V

    sput-object v0, Lr3/h;->d:Lr3/h;

    new-instance v0, Lr3/h;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr3/h;-><init>(I)V

    sput-object v0, Lr3/h;->e:Lr3/h;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lr3/h;->c:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr3/h;->c:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Lc3/i;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lc3/k;

    check-cast p2, Lc3/i;

    invoke-interface {p1, p2}, Lc3/k;->x(Lc3/k;)Lc3/k;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
