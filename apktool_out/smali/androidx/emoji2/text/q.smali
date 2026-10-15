.class public final Landroidx/emoji2/text/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:I

.field public final b:Lg/h;

.field public volatile c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Landroidx/emoji2/text/q;->d:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Lg/h;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/emoji2/text/q;->c:I

    iput-object p1, p0, Landroidx/emoji2/text/q;->b:Lg/h;

    iput p2, p0, Landroidx/emoji2/text/q;->a:I

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 4

    invoke-virtual {p0}, Landroidx/emoji2/text/q;->c()Lq0/a;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lq0/b;->a(I)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, v0, Lq0/b;->d:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Ljava/nio/ByteBuffer;

    iget v0, v0, Lq0/b;->a:I

    add-int/2addr v1, v0

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x4

    mul-int/lit8 p1, p1, 0x4

    add-int/2addr p1, v0

    invoke-virtual {v3, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final b()I
    .locals 3

    invoke-virtual {p0}, Landroidx/emoji2/text/q;->c()Lq0/a;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Lq0/b;->a(I)I

    move-result v1

    if-eqz v1, :cond_0

    iget v2, v0, Lq0/b;->a:I

    add-int/2addr v1, v2

    iget-object v2, v0, Lq0/b;->d:Ljava/lang/Object;

    check-cast v2, Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v2

    add-int/2addr v2, v1

    iget-object v0, v0, Lq0/b;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final c()Lq0/a;
    .locals 4

    sget-object v0, Landroidx/emoji2/text/q;->d:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq0/a;

    if-nez v1, :cond_0

    new-instance v1, Lq0/a;

    invoke-direct {v1}, Lq0/b;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Landroidx/emoji2/text/q;->b:Lg/h;

    iget-object v0, v0, Lg/h;->c:Ljava/lang/Object;

    check-cast v0, La2/a;

    const/4 v2, 0x6

    invoke-virtual {v0, v2}, Lq0/b;->a(I)I

    move-result v2

    if-eqz v2, :cond_1

    iget v3, v0, Lq0/b;->a:I

    add-int/2addr v2, v3

    iget-object v3, v0, Lq0/b;->d:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    add-int/2addr v3, v2

    add-int/lit8 v3, v3, 0x4

    iget v2, p0, Landroidx/emoji2/text/q;->a:I

    mul-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v3

    iget-object v3, v0, Lq0/b;->d:Ljava/lang/Object;

    check-cast v3, Ljava/nio/ByteBuffer;

    invoke-virtual {v3, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v3

    add-int/2addr v3, v2

    iget-object v0, v0, Lq0/b;->d:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v3, v0}, Lq0/b;->b(ILjava/nio/ByteBuffer;)V

    :cond_1
    return-object v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/emoji2/text/q;->c()Lq0/a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lq0/b;->a(I)I

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, v1, Lq0/b;->d:Ljava/lang/Object;

    check-cast v4, Ljava/nio/ByteBuffer;

    iget v1, v1, Lq0/b;->a:I

    add-int/2addr v2, v1

    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codepoints:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/emoji2/text/q;->b()I

    move-result v1

    :goto_1
    if-ge v3, v1, :cond_1

    invoke-virtual {p0, v3}, Landroidx/emoji2/text/q;->a(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
