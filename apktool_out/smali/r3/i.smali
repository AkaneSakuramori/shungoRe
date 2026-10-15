.class public final Lr3/i;
.super Lk3/g;
.source "SourceFile"

# interfaces
.implements Lj3/l;


# static fields
.field public static final d:Lr3/i;

.field public static final e:Lr3/i;


# instance fields
.field public final synthetic c:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lr3/i;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr3/i;-><init>(I)V

    sput-object v0, Lr3/i;->d:Lr3/i;

    new-instance v0, Lr3/i;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lr3/i;-><init>(I)V

    sput-object v0, Lr3/i;->e:Lr3/i;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lr3/i;->c:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lk3/g;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lr3/i;->c:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lc3/i;

    instance-of v0, p1, Lr3/d0;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lr3/d0;

    :cond_0
    return-object v1

    :pswitch_0
    check-cast p1, Lc3/i;

    instance-of v0, p1, Lr3/k;

    if-eqz v0, :cond_1

    move-object v1, p1

    check-cast v1, Lr3/k;

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
