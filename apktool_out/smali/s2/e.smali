.class public abstract Ls2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z

.field public static final b:Ls2/d;

.field public static final c:Ls2/d;

.field public static final d:Lcom/auth0/android/request/internal/i;

.field public static final e:Lcom/auth0/android/request/internal/i;

.field public static final f:Lcom/auth0/android/request/internal/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "java.sql.Date"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v0

    goto :goto_0

    :catch_0
    move v2, v1

    :goto_0
    sput-boolean v2, Ls2/e;->a:Z

    if-eqz v2, :cond_0

    new-instance v2, Ls2/d;

    const-class v3, Ljava/sql/Date;

    invoke-direct {v2, v3, v1}, Ls2/d;-><init>(Ljava/lang/Class;I)V

    sput-object v2, Ls2/e;->b:Ls2/d;

    new-instance v1, Ls2/d;

    const-class v2, Ljava/sql/Timestamp;

    invoke-direct {v1, v2, v0}, Ls2/d;-><init>(Ljava/lang/Class;I)V

    sput-object v1, Ls2/e;->c:Ls2/d;

    sget-object v0, Ls2/a;->b:Lcom/auth0/android/request/internal/i;

    sput-object v0, Ls2/e;->d:Lcom/auth0/android/request/internal/i;

    sget-object v0, Ls2/b;->b:Lcom/auth0/android/request/internal/i;

    sput-object v0, Ls2/e;->e:Lcom/auth0/android/request/internal/i;

    sget-object v0, Ls2/c;->b:Lcom/auth0/android/request/internal/i;

    sput-object v0, Ls2/e;->f:Lcom/auth0/android/request/internal/i;

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Ls2/e;->b:Ls2/d;

    sput-object v0, Ls2/e;->c:Ls2/d;

    sput-object v0, Ls2/e;->d:Lcom/auth0/android/request/internal/i;

    sput-object v0, Ls2/e;->e:Lcom/auth0/android/request/internal/i;

    sput-object v0, Ls2/e;->f:Lcom/auth0/android/request/internal/i;

    :goto_1
    return-void
.end method
