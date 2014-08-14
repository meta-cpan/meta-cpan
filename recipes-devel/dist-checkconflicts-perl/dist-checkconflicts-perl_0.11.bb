DESCRIPTION = "One shortcoming of the CPAN clients that currently exist is that they \
have no way of specifying conflicting downstream dependencies of \
modules. This \
module attempts to work around this issue by allowing you to specify \
conflicting versions of modules separately, and deal with them after \
the \
module is done installing."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Dist-CheckConflicts"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DO/DOY/Dist-CheckConflicts-0.11.tar.gz"

SRC_URI[md5sum] = "c8725a92b9169708b0f63036812070f2"
SRC_URI[sha256sum] = "ea844b9686c94d666d9d444321d764490b2cde2f985c4165b4c2c77665caedc4"
RDEPENDS_${PN} += "module-runtime-perl"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Dist-CheckConflicts-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
