DESCRIPTION = ""Hash::FieldHash" provides the field hash mechanism which supports the \
inside-out technique."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-FieldHash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GF/GFUJI/Hash-FieldHash-0.15.tar.gz \
           file://Build_PL_add-dot-to-INC.patch \
"

SRC_URI[md5sum] = "0d3d32801d0638d120dcf3f670a1ae17"
SRC_URI[sha256sum] = "5c515707a5433796a5697b118ddbf1f216d13c5cd52f2b64292e76f7d9b7e8f1"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Hash-FieldHash-${PV}"

inherit cpan_build

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${LD} ${LDFLAGS}""

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	export LD="${LD} ${LDFLAGS}"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
