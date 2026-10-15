.class public Le/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li/n2;
.implements Lh/b0;
.implements Lh/m;
.implements Li/f1;
.implements Li0/s;
.implements Li0/g;
.implements Ll0/d;
.implements Lw0/d;
.implements Lj0/b0;
.implements Ls1/a;


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x11

    iput v0, p0, Le/n0;->b:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 30
    new-instance v0, Landroidx/emoji2/text/e;

    .line 31
    invoke-direct {v0}, Landroidx/emoji2/text/d;-><init>()V

    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, Landroidx/emoji2/text/d;

    invoke-direct {v0}, Landroidx/emoji2/text/d;-><init>()V

    :goto_0
    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Le/n0;->b:I

    const/16 v0, 0xa

    if-eq p1, v0, :cond_4

    const/16 v0, 0xe

    if-eq p1, v0, :cond_1

    const/16 v0, 0x15

    if-eq p1, v0, :cond_0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void

    .line 7
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void

    .line 9
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p1, v0, :cond_2

    .line 10
    new-instance p1, Li0/s1;

    invoke-direct {p1}, Li0/s1;-><init>()V

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_2
    const/16 v0, 0x1d

    if-lt p1, v0, :cond_3

    .line 11
    new-instance p1, Li0/r1;

    invoke-direct {p1}, Li0/r1;-><init>()V

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    goto :goto_0

    .line 12
    :cond_3
    new-instance p1, Li0/q1;

    invoke-direct {p1}, Li0/q1;-><init>()V

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    :goto_0
    return-void

    .line 13
    :cond_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Le/n0;->b:I

    iput-object p2, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xb

    iput v0, p0, Le/n0;->b:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 39
    new-instance v0, Li0/d;

    invoke-direct {v0, p1, p2}, Li0/d;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    goto :goto_0

    .line 40
    :cond_0
    new-instance v0, Li0/f;

    invoke-direct {v0, p1, p2}, Li0/f;-><init>(Landroid/content/ClipData;I)V

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc

    iput v0, p0, Le/n0;->b:I

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-static {p1}, Lc2/e;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;I)V
    .locals 1

    iput p2, p0, Le/n0;->b:I

    const/16 v0, 0x18

    if-eq p2, v0, :cond_1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-lt p2, v0, :cond_0

    .line 16
    new-instance p2, Li0/y;

    .line 17
    invoke-direct {p2, p1}, Li0/w;-><init>(Landroid/view/View;)V

    iput-object p1, p2, Li0/y;->e:Landroid/view/View;

    iput-object p2, p0, Le/n0;->c:Ljava/lang/Object;

    goto :goto_0

    .line 18
    :cond_0
    new-instance p2, Li0/w;

    invoke-direct {p2, p1}, Li0/w;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Le/n0;->c:Ljava/lang/Object;

    :goto_0
    return-void

    .line 19
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    move-result-object p1

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x17

    iput v0, p0, Le/n0;->b:I

    .line 4
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xd

    iput v0, p0, Le/n0;->b:I

    .line 22
    new-instance v0, Li0/y;

    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Li0/w;-><init>(Landroid/view/View;)V

    iput-object p1, v0, Li0/y;->f:Landroid/view/WindowInsetsController;

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x14

    iput v0, p0, Le/n0;->b:I

    if-eqz p1, :cond_0

    .line 25
    new-instance v0, Lr0/i;

    invoke-direct {v0, p1}, Lr0/i;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    return-void

    .line 26
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "textView cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Lc3/h;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x9

    iput v0, p0, Le/n0;->b:I

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/material/button/MaterialButtonToggleGroup;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, Le/n0;->b:I

    .line 41
    invoke-direct {p0, v0, p1}, Le/n0;-><init>(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Li0/c2;)V
    .locals 2

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xe

    iput v0, p0, Le/n0;->b:I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 43
    new-instance v0, Li0/s1;

    invoke-direct {v0, p1}, Li0/s1;-><init>(Li0/c2;)V

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 44
    new-instance v0, Li0/r1;

    invoke-direct {v0, p1}, Li0/r1;-><init>(Li0/c2;)V

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    goto :goto_0

    .line 45
    :cond_1
    new-instance v0, Li0/q1;

    invoke-direct {v0, p1}, Li0/q1;-><init>(Li0/c2;)V

    iput-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    iput v0, p0, Le/n0;->b:I

    .line 28
    check-cast p1, Landroid/view/inputmethod/InputContentInfo;

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x13

    iput v0, p0, Le/n0;->b:I

    iput-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    .line 34
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static A([Ljava/lang/Object;ILf2/e;)Ljava/lang/Object;
    .locals 10

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/16 v0, 0x190

    goto :goto_0

    :cond_0
    const/16 v0, 0x2bc

    :goto_0
    and-int/lit8 p1, p1, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p1, :cond_1

    move p1, v1

    goto :goto_1

    :cond_1
    move p1, v2

    :goto_1
    array-length v3, p0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    move v6, v2

    :goto_2
    if-ge v6, v3, :cond_5

    aget-object v7, p0, v6

    iget v8, p2, Lf2/e;->b:I

    packed-switch v8, :pswitch_data_0

    move-object v9, v7

    check-cast v9, La0/h;

    iget v9, v9, La0/h;->b:I

    goto :goto_3

    :pswitch_0
    move-object v9, v7

    check-cast v9, Lf0/h;

    iget v9, v9, Lf0/h;->c:I

    :goto_3
    sub-int/2addr v9, v0

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    packed-switch v8, :pswitch_data_1

    move-object v8, v7

    check-cast v8, La0/h;

    iget-boolean v8, v8, La0/h;->c:Z

    goto :goto_4

    :pswitch_1
    move-object v8, v7

    check-cast v8, Lf0/h;

    iget-boolean v8, v8, Lf0/h;->d:Z

    :goto_4
    if-ne v8, p1, :cond_2

    move v8, v2

    goto :goto_5

    :cond_2
    move v8, v1

    :goto_5
    add-int/2addr v9, v8

    if-eqz v4, :cond_3

    if-le v5, v9, :cond_4

    :cond_3
    move-object v4, v7

    move v5, v9

    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    return-object v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public B(I[Lf0/h;)Lf0/h;
    .locals 2

    new-instance v0, Lf2/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf2/e;-><init>(I)V

    invoke-static {p2, p1, v0}, Le/n0;->A([Ljava/lang/Object;ILf2/e;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf0/h;

    return-object p1
.end method

.method public final C(Landroid/content/pm/ProviderInfo;Landroid/content/pm/PackageManager;)Li/r;
    .locals 5

    iget-object v0, p1, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    iget-object v1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v1, Lf2/e;

    invoke-virtual {v1, p2, p1}, Lf2/e;->y(Landroid/content/pm/PackageManager;Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, p2, v3

    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance v1, Li/r;

    const-string v2, "emojicompat-emoji-font"

    invoke-direct {v1, v0, p1, v2, p2}, Li/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v1
.end method

.method public final D()J
    .locals 4

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final E(I)V
    .locals 2

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/nio/ByteBuffer;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    add-int/2addr v0, p1

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-void
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public final b(Lh/o;Z)V
    .locals 2

    instance-of v0, p1, Lh/i0;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lh/o;->k()Lh/o;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh/o;->c(Z)V

    :cond_0
    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/m;

    iget-object v0, v0, Li/m;->f:Lh/b0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lh/b0;->b(Lh/o;Z)V

    :cond_1
    return-void
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, Lc2/e;->l(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public final d(Lh/o;)V
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Lh/m;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lh/m;->d(Lh/o;)V

    :cond_0
    return-void
.end method

.method public final e(Lh/o;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->B:Li/p;

    if-eqz p1, :cond_1

    check-cast p1, Li/r3;

    iget-object p1, p1, Li/r3;->b:Landroidx/appcompat/widget/Toolbar;

    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->H:Le/c;

    iget-object p1, p1, Le/c;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, La;->n(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final f()Landroid/content/ClipDescription;
    .locals 1

    iget v0, p0, Le/n0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Ll0/d;

    invoke-interface {v0}, Ll0/d;->f()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getDescription()Landroid/content/ClipDescription;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public final g()V
    .locals 1

    iget v0, p0, Le/n0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Ll0/d;

    invoke-interface {v0}, Ll0/d;->g()V

    return-void

    :pswitch_0
    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public final h()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, Lc2/e;->d(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public final i(Lh/o;Landroid/view/MenuItem;)V
    .locals 0

    iget-object p2, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast p2, Lh/i;

    iget-object p2, p2, Lh/i;->h:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Landroid/view/View;)Z
    .locals 3

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {v0, p1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->r(Landroid/view/View;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    sget-object v0, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Li0/f0;->d(Landroid/view/View;)I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v1, v2

    :cond_0
    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->d:I

    if-nez v0, :cond_1

    if-nez v1, :cond_2

    :cond_1
    if-ne v0, v2, :cond_3

    if-nez v1, :cond_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    neg-int v0, v0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v2

    :cond_4
    return v1
.end method

.method public final k(Lh/o;)Z
    .locals 3

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Li/m;

    iget-object v1, v1, Li/m;->d:Lh/o;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    check-cast v0, Li/m;

    move-object v1, p1

    check-cast v1, Lh/i0;

    iget-object v1, v1, Lh/i0;->A:Lh/q;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li/m;

    iget-object v0, v0, Li/m;->f:Lh/b0;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lh/b0;->k(Lh/o;)Z

    move-result v2

    :cond_1
    return v2
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget v0, p0, Le/n0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Ll0/d;

    invoke-interface {v0}, Ll0/d;->l()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getLinkUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public final m()I
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, Lc2/e;->b(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public final n()V
    .locals 1

    sget-object v0, Lw0/e;->b:Lf2/e;

    invoke-virtual {v0}, Lf2/e;->n()V

    return-void
.end method

.method public final o(Lh/o;Lh/q;)V
    .locals 8

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lh/i;

    iget-object v0, v0, Lh/i;->h:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lh/i;

    iget-object v0, v0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, -0x1

    if-ge v2, v0, :cond_1

    iget-object v4, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v4, Lh/i;

    iget-object v4, v4, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh/h;

    iget-object v4, v4, Lh/h;->b:Lh/o;

    if-ne p1, v4, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_1
    if-ne v2, v3, :cond_2

    return-void

    :cond_2
    add-int/lit8 v2, v2, 0x1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lh/i;

    iget-object v0, v0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_3

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Lh/i;

    iget-object v0, v0, Lh/i;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lh/h;

    :cond_3
    move-object v4, v1

    new-instance v0, Lh/g;

    const/4 v7, 0x0

    move-object v2, v0

    move-object v3, p0

    move-object v5, p2

    move-object v6, p1

    invoke-direct/range {v2 .. v7}, Lh/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    const-wide/16 v3, 0xc8

    add-long/2addr v1, v3

    iget-object p2, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast p2, Lh/i;

    iget-object p2, p2, Lh/i;->h:Landroid/os/Handler;

    invoke-virtual {p2, v0, p1, v1, v2}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public final p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    return-object v0
.end method

.method public final q(Landroid/view/View;Li0/c2;)Li0/c2;
    .locals 5

    iget-object p1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Li0/c2;

    invoke-static {v0, p2}, Lh0/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    iput-object p2, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Li0/c2;

    invoke-virtual {p2}, Li0/c2;->d()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->p:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    iget-object v0, p2, Li0/c2;->a:Li0/a2;

    invoke-virtual {v0}, Li0/a2;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_2
    if-ge v2, v1, :cond_4

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    sget-object v4, Li0/v0;->a:Ljava/util/WeakHashMap;

    invoke-static {v3}, Li0/e0;->b(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Lw/d;

    iget-object v3, v3, Lw/d;->a:Lw/a;

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Li0/a2;->m()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-object p2
.end method

.method public final r()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    return-object v0
.end method

.method public final s()Landroid/net/Uri;
    .locals 1

    iget v0, p0, Le/n0;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Ll0/d;

    invoke-interface {v0}, Ll0/d;->s()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->getContentUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public final t(ILjava/lang/Object;)V
    .locals 1

    sget-object v0, Lw0/e;->b:Lf2/e;

    invoke-virtual {v0, p1, p2}, Lf2/e;->t(ILjava/lang/Object;)V

    iget-object p2, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast p2, Landroidx/profileinstaller/ProfileInstallReceiver;

    invoke-virtual {p2, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Le/n0;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_0
    .end packed-switch
.end method

.method public u(I)V
    .locals 0

    return-void
.end method

.method public final v()Li0/c2;
    .locals 1

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Li0/t1;

    invoke-virtual {v0}, Li0/t1;->b()Li0/c2;

    move-result-object v0

    return-object v0
.end method

.method public w(Landroid/content/Context;La0/g;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
    .locals 9

    new-instance v0, Lf2/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf2/e;-><init>(I)V

    iget-object v2, p2, La0/g;->a:[La0/h;

    invoke-static {v2, p4, v0}, Le/n0;->A([Ljava/lang/Object;ILf2/e;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La0/h;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget v8, v0, La0/h;->f:I

    iget-object v0, v0, La0/h;->a:Ljava/lang/String;

    sget-object v2, Lb0/g;->a:Le/n0;

    move-object v3, p1

    move-object v4, p3

    move v5, v8

    move-object v6, v0

    move v7, p4

    invoke-virtual/range {v2 .. v7}, Le/n0;->z(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v2, 0x0

    invoke-static {p3, v8, v0, v2, p4}, Lb0/g;->b(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    move-result-object p3

    sget-object p4, Lb0/g;->b:Ln/f;

    invoke-virtual {p4, p3, p1}, Ln/f;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string p3, "Could not retrieve font from family."

    const-string p4, "TypefaceCompatBaseImpl"

    const-wide/16 v2, 0x0

    if-nez p1, :cond_2

    :goto_0
    move-wide p3, v2

    goto :goto_3

    :cond_2
    :try_start_0
    const-class v0, Landroid/graphics/Typeface;

    const-string v4, "native_instance"

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide p3
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :goto_1
    invoke-static {p4, p3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :goto_2
    invoke-static {p4, p3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :goto_3
    cmp-long v0, p3, v2

    if-eqz v0, :cond_3

    iget-object v0, p0, Le/n0;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {v0, p3, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object p1
.end method

.method public x(Landroid/content/Context;[Lf0/h;I)Landroid/graphics/Typeface;
    .locals 3

    array-length v0, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {p0, p3, p2}, Le/n0;->B(I[Lf0/h;)Lf0/h;

    move-result-object p2

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    iget-object p2, p2, Lf0/h;->a:Landroid/net/Uri;

    invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0, p1, p2}, Le/n0;->y(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p2}, Lc3/h;->l0(Ljava/io/Closeable;)V

    return-object p1

    :catchall_0
    move-exception p1

    move-object v2, p2

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_0

    :catch_0
    move-object p2, v2

    goto :goto_1

    :goto_0
    invoke-static {v2}, Lc3/h;->l0(Ljava/io/Closeable;)V

    throw p1

    :catch_1
    :goto_1
    invoke-static {p2}, Lc3/h;->l0(Ljava/io/Closeable;)V

    return-object v2
.end method

.method public y(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    .locals 1

    invoke-static {p1}, Lc3/h;->b1(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {p1, p2}, Lc3/h;->v0(Ljava/io/File;Ljava/io/InputStream;)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0
.end method

.method public z(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    invoke-static {p1}, Lc3/h;->b1(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 p4, 0x0

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lc3/h;->u0(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4
.end method
