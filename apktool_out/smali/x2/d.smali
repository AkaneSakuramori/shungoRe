.class public abstract Lx2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newCachedThreadPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lx2/d;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static varargs a([Ljava/lang/String;)Ly2/g;
    .locals 3

    new-instance v0, Ly2/g;

    invoke-direct {v0}, Ly2/g;-><init>()V

    array-length v1, p0

    if-lez v1, :cond_0

    iget-object v1, v0, Ly2/c;->j:Ljava/util/ArrayList;

    new-instance v2, Ly2/b;

    invoke-direct {v2, p0}, Ly2/b;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final e()Z
    .locals 2

    move-object v0, p0

    check-cast v0, Ly2/m;

    iget v0, v0, Ly2/m;->c:I

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
