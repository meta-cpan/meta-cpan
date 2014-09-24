DESCRIPTION = "When enabled, this pragma warns about indirect method calls that are \
present in your code."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/indirect"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/V/VP/VPIT/indirect-0.32.tar.gz"

SRC_URI[md5sum] = "aac799064d3422df200f089dc54e9705"
SRC_URI[sha256sum] = "8cb5fbdedf47a84e479f5cc8e839830490f7f6cea6a85ab605ac2ccc3fc13087"

S = "${WORKDIR}/indirect-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
