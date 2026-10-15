.class public final Li/h3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li/h3;->a:I

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Li/h3;->a:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 13
    new-instance v0, Li2/z;

    invoke-direct {v0, p1, v1}, Li2/z;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lg2/d;

    invoke-direct {v0, p1, v1}, Lg2/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 15
    :pswitch_1
    new-instance v0, Lz1/a;

    invoke-direct {v0, p1, v1}, Lz1/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 16
    :pswitch_2
    new-instance v0, Ls1/b;

    invoke-direct {v0, p1, v1}, Ls1/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 17
    :pswitch_3
    new-instance v0, Lr1/c;

    invoke-direct {v0, p1, v1}, Lr1/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_4
    new-instance v0, Lp1/b;

    invoke-direct {v0, p1, v1}, Lp1/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 19
    :pswitch_5
    new-instance v0, Ly0/x0;

    invoke-direct {v0, p1, v1}, Ly0/x0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 20
    :pswitch_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lo0/b;->c:Lo0/a;

    return-object p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :pswitch_7
    new-instance v0, Lw/f;

    invoke-direct {v0, p1, v1}, Lw/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 23
    :pswitch_8
    new-instance v0, Li/w3;

    invoke-direct {v0, p1, v1}, Li/w3;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 24
    :pswitch_9
    new-instance v0, Li/i3;

    invoke-direct {v0, p1, v1}, Li/i3;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li/h3;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Li2/z;

    invoke-direct {v0, p1, p2}, Li2/z;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Lg2/d;

    invoke-direct {v0, p1, p2}, Lg2/d;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 3
    :pswitch_1
    new-instance v0, Lz1/a;

    invoke-direct {v0, p1, p2}, Lz1/a;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 4
    :pswitch_2
    new-instance v0, Ls1/b;

    invoke-direct {v0, p1, p2}, Ls1/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 5
    :pswitch_3
    new-instance v0, Lr1/c;

    invoke-direct {v0, p1, p2}, Lr1/c;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_4
    new-instance v0, Lp1/b;

    invoke-direct {v0, p1, p2}, Lp1/b;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_5
    new-instance v0, Ly0/x0;

    invoke-direct {v0, p1, p2}, Ly0/x0;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 8
    :pswitch_6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lo0/b;->c:Lo0/a;

    return-object p1

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :pswitch_7
    new-instance v0, Lw/f;

    invoke-direct {v0, p1, p2}, Lw/f;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 11
    :pswitch_8
    new-instance v0, Li/w3;

    invoke-direct {v0, p1, p2}, Li/w3;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 12
    :pswitch_9
    new-instance v0, Li/i3;

    invoke-direct {v0, p1, p2}, Li/i3;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Li/h3;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [Li2/z;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lg2/d;

    return-object p1

    :pswitch_1
    new-array p1, p1, [Lz1/a;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Ls1/b;

    return-object p1

    :pswitch_3
    new-array p1, p1, [Lr1/c;

    return-object p1

    :pswitch_4
    new-array p1, p1, [Lp1/b;

    return-object p1

    :pswitch_5
    new-array p1, p1, [Ly0/x0;

    return-object p1

    :pswitch_6
    new-array p1, p1, [Lo0/b;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lw/f;

    return-object p1

    :pswitch_8
    new-array p1, p1, [Li/w3;

    return-object p1

    :pswitch_9
    new-array p1, p1, [Li/i3;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
