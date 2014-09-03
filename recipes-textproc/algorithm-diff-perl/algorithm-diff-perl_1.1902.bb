DESCRIPTION = "Compute `intelligent' differences between two files / lists but use the \
old (<=0.59) interface."

SECTION = "libs"
LICENSE = "unknown(unknown)"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Algorithm-Diff"

LIC_FILES_CHKSUM = "unknown(unknown)"

SRC_URI = "http://cpan.metacpan.org/authors/id/T/TY/TYEMQ/Algorithm-Diff-1.1902.tar.gz"

SRC_URI[md5sum] = "ff3e17ae485f8adfb8857b183991fbce"
SRC_URI[sha256sum] = "c8b40dbf406770c6bcbd1a26a3f2343fa1563675085b63932d06f37e60098375"

S = "${WORKDIR}/Algorithm-Diff-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
