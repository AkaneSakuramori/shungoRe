.class public final Lg/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/b;
.implements Le0/d;
.implements Lo2/n;


# static fields
.field public static f:Lg/h;


# instance fields
.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Lp/e;

    const/16 v0, 0x100

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lp/e;-><init>(II)V

    iput-object p1, p0, Lg/h;->c:Ljava/lang/Object;

    .line 3
    new-instance p1, Lp/e;

    invoke-direct {p1, v0, v1}, Lp/e;-><init>(II)V

    iput-object p1, p0, Lg/h;->b:Ljava/lang/Object;

    .line 4
    new-instance p1, Lp/e;

    invoke-direct {p1, v0, v1}, Lp/e;-><init>(II)V

    iput-object p1, p0, Lg/h;->d:Ljava/lang/Object;

    const/16 p1, 0x20

    new-array p1, p1, [Lp/i;

    iput-object p1, p0, Lg/h;->e:Ljava/lang/Object;

    return-void

    .line 5
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/h;->c:Ljava/lang/Object;

    .line 7
    new-instance p1, Landroid/os/Handler;

    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Lh2/e;

    invoke-direct {v1, p0}, Lh2/e;-><init>(Lg/h;)V

    invoke-direct {p1, v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lg/h;->b:Ljava/lang/Object;

    return-void

    .line 9
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Ln/b;

    .line 11
    invoke-direct {p1}, Ln/k;-><init>()V

    iput-object p1, p0, Lg/h;->c:Ljava/lang/Object;

    .line 12
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lg/h;->b:Ljava/lang/Object;

    .line 13
    new-instance p1, Ln/e;

    invoke-direct {p1}, Ln/e;-><init>()V

    iput-object p1, p0, Lg/h;->d:Ljava/lang/Object;

    .line 14
    new-instance p1, Ln/b;

    .line 15
    invoke-direct {p1}, Ln/k;-><init>()V

    iput-object p1, p0, Lg/h;->e:Ljava/lang/Object;

    return-void

    .line 16
    :cond_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance p1, Lp/e;

    const/16 v0, 0xa

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, Lp/e;-><init>(II)V

    iput-object p1, p0, Lg/h;->c:Ljava/lang/Object;

    .line 18
    new-instance p1, Ln/k;

    invoke-direct {p1}, Ln/k;-><init>()V

    iput-object p1, p0, Lg/h;->e:Ljava/lang/Object;

    .line 19
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg/h;->d:Ljava/lang/Object;

    .line 20
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lg/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Typeface;La2/a;)V
    .locals 5

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg/h;->e:Ljava/lang/Object;

    iput-object p2, p0, Lg/h;->c:Ljava/lang/Object;

    .line 22
    new-instance p1, Landroidx/emoji2/text/w;

    const/16 p2, 0x400

    invoke-direct {p1, p2}, Landroidx/emoji2/text/w;-><init>(I)V

    iput-object p1, p0, Lg/h;->d:Ljava/lang/Object;

    iget-object p1, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast p1, La2/a;

    const/4 p2, 0x6

    .line 23
    invoke-virtual {p1, p2}, Lq0/b;->a(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 24
    iget v2, p1, Lq0/b;->a:I

    add-int/2addr v0, v2

    .line 25
    iget-object v2, p1, Lq0/b;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v0

    .line 26
    iget-object p1, p1, Lq0/b;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    mul-int/lit8 p1, p1, 0x2

    .line 27
    new-array p1, p1, [C

    iput-object p1, p0, Lg/h;->b:Ljava/lang/Object;

    iget-object p1, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast p1, La2/a;

    .line 28
    invoke-virtual {p1, p2}, Lq0/b;->a(I)I

    move-result p2

    if-eqz p2, :cond_1

    .line 29
    iget v0, p1, Lq0/b;->a:I

    add-int/2addr p2, v0

    .line 30
    iget-object v0, p1, Lq0/b;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p2

    .line 31
    iget-object p1, p1, Lq0/b;->d:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    move p2, v1

    :goto_2
    if-ge p2, p1, :cond_4

    .line 32
    new-instance v0, Landroidx/emoji2/text/q;

    invoke-direct {v0, p0, p2}, Landroidx/emoji2/text/q;-><init>(Lg/h;I)V

    .line 33
    invoke-virtual {v0}, Landroidx/emoji2/text/q;->c()Lq0/a;

    move-result-object v2

    const/4 v3, 0x4

    .line 34
    invoke-virtual {v2, v3}, Lq0/b;->a(I)I

    move-result v3

    if-eqz v3, :cond_2

    iget-object v4, v2, Lq0/b;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v2, v2, Lq0/b;->a:I

    add-int/2addr v3, v2

    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    goto :goto_3

    :cond_2
    move v2, v1

    :goto_3
    iget-object v3, p0, Lg/h;->b:Ljava/lang/Object;

    check-cast v3, [C

    mul-int/lit8 v4, p2, 0x2

    .line 35
    invoke-static {v2, v3, v4}, Ljava/lang/Character;->toChars(I[CI)I

    .line 36
    invoke-virtual {v0}, Landroidx/emoji2/text/q;->b()I

    move-result v2

    const/4 v3, 0x1

    if-lez v2, :cond_3

    move v2, v3

    goto :goto_4

    :cond_3
    move v2, v1

    :goto_4
    const-string v4, "invalid metadata codepoint length"

    invoke-static {v4, v2}, Lc3/h;->U(Ljava/lang/String;Z)V

    iget-object v2, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast v2, Landroidx/emoji2/text/w;

    .line 37
    invoke-virtual {v0}, Landroidx/emoji2/text/q;->b()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v2, v0, v1, v4}, Landroidx/emoji2/text/w;->a(Landroidx/emoji2/text/q;II)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method


# virtual methods
.method public final a(Lg/c;Lh/o;)Z
    .locals 1

    iget-object v0, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lg/h;->h(Lg/c;)Lg/i;

    move-result-object p1

    invoke-virtual {p0, p2}, Lg/h;->i(Lh/o;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final b(Lg/c;)V
    .locals 1

    iget-object v0, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lg/h;->h(Lg/c;)Lg/i;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final c(Lg/c;Lh/o;)Z
    .locals 1

    iget-object v0, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lg/h;->h(Lg/c;)Lg/i;

    move-result-object p1

    invoke-virtual {p0, p2}, Lg/h;->i(Lh/o;)Landroid/view/Menu;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final d()Ljava/lang/Object;
    .locals 4

    :try_start_0
    iget-object v0, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, Lc3/h;

    iget-object v1, p0, Lg/h;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lc3/h;->C1(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to invoke no-args constructor for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast v3, Ljava/lang/reflect/Type;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ". Registering an InstanceCreator with Gson for this type may fix this problem."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    iget-object v0, p0, Lg/h;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/f;

    invoke-virtual {v0}, Le/b0;->b()V

    return-void
.end method

.method public final f(Lg/c;Landroid/view/MenuItem;)Z
    .locals 3

    iget-object v0, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ActionMode$Callback;

    invoke-virtual {p0, p1}, Lg/h;->h(Lg/c;)Lg/i;

    move-result-object p1

    new-instance v1, Lh/w;

    iget-object v2, p0, Lg/h;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    check-cast p2, Ld0/b;

    invoke-direct {v1, v2, p2}, Lh/w;-><init>(Landroid/content/Context;Ld0/b;)V

    invoke-interface {v0, p1, v1}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
    .locals 4

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lg/h;->e:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3, p2, p3}, Lg/h;->g(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "This graph contains cyclic dependencies"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Lg/c;)Lg/i;
    .locals 4

    iget-object v0, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg/i;

    if-eqz v2, :cond_0

    iget-object v3, v2, Lg/i;->b:Lg/c;

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance v0, Lg/i;

    iget-object v1, p0, Lg/h;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lg/i;-><init>(Landroid/content/Context;Lg/c;)V

    iget-object p1, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final i(Lh/o;)Landroid/view/Menu;
    .locals 2

    iget-object v0, p0, Lg/h;->e:Ljava/lang/Object;

    check-cast v0, Ln/k;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ln/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Menu;

    if-nez v0, :cond_0

    new-instance v0, Lh/f0;

    iget-object v1, p0, Lg/h;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lh/f0;-><init>(Landroid/content/Context;Ld0/a;)V

    iget-object v1, p0, Lg/h;->e:Ljava/lang/Object;

    check-cast v1, Ln/k;

    invoke-virtual {v1, p1, v0}, Ln/k;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final j(Landroid/app/PendingIntent;)Ll/e;
    .locals 9

    new-instance v0, Ll/b;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    const-string v1, "android.support.customtabs.ICustomTabsCallback"

    invoke-virtual {v0, v0, v1}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "android.support.customtabs.ICustomTabsService"

    const/4 v4, 0x0

    if-eqz p1, :cond_2

    :try_start_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "android.support.customtabs.extra.SESSION_ID"

    invoke-virtual {v5, v6, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v6, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v6, La/e;

    check-cast v6, La/c;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v7

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v8
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v7, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    invoke-virtual {v7, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v5, v7, v1}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v3, v6, La/c;->a:Landroid/os/IBinder;

    const/16 v5, 0xa

    invoke-interface {v3, v5, v7, v8, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v3

    if-nez v3, :cond_0

    sget v3, La/d;->a:I

    :cond_0
    invoke-virtual {v8}, Landroid/os/Parcel;->readException()V

    invoke-virtual {v8}, Landroid/os/Parcel;->readInt()I

    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    :try_start_2
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    throw p1

    :cond_2
    iget-object v5, p0, Lg/h;->c:Ljava/lang/Object;

    check-cast v5, La/e;

    check-cast v5, La/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v6

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v7
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    :try_start_3
    invoke-virtual {v6, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    iget-object v3, v5, La/c;->a:Landroid/os/IBinder;

    const/4 v5, 0x3

    invoke-interface {v3, v5, v6, v7, v1}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v3

    if-nez v3, :cond_3

    sget v3, La/d;->a:I

    :cond_3
    invoke-virtual {v7}, Landroid/os/Parcel;->readException()V

    invoke-virtual {v7}, Landroid/os/Parcel;->readInt()I

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v3, :cond_4

    move v1, v2

    :cond_4
    :try_start_4
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_0
    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    new-instance v4, Ll/e;

    iget-object v1, p0, Lg/h;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/ComponentName;

    invoke-direct {v4, v0, v1, p1}, Ll/e;-><init>(Ll/b;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {v7}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v6}, Landroid/os/Parcel;->recycle()V

    throw p1
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_0

    :catch_0
    :goto_1
    return-object v4
.end method
