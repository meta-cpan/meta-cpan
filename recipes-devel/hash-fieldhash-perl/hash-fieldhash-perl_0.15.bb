DESCRIPTION = ""Hash::FieldHash" provides the field hash mechanism which supports the \
inside-out technique."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Hash-FieldHash"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/G/GF/GFUJI/Hash-FieldHash-0.15.tar.gz \
           file://Build_PL_add-dot-to-INC.patch \
"

SRC_URI[md5sum] = "0d3d32801d0638d120dcf3f670a1ae17"
SRC_URI[sha256sum] = "5c515707a5433796a5697b118ddbf1f216d13c5cd52f2b64292e76f7d9b7e8f1"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-leaktrace-perl-native"

S = "${WORKDIR}/Hash-FieldHash-${PV}"

EXTRA_CPAN_BUILD_FLAGS="--config cc="${CC}" --config ccflags="${CFLAGS}" --config ld="${CCLD} ${LDFLAGS}""

inherit cpan_build

do_compile() {
	export LD="${CCLD} ${LDFLAGS}"
	cpan_build_do_compile
}

BBCLASSEXTEND = "native"
